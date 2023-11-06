package com.studentAttendance;

import java.sql.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.studentAttendance.Trend.TrendData;
import com.studentAttendance.attendanceRate.AttendanceRate;
import com.studentAttendance.cardRepository.CardRepository;
import com.studentAttendance.classlistAttendance.ClasslistAttendance;
import com.studentAttendance.classlistData.ClasslistData;
import com.studentAttendance.clockedInRepository.ClockedInRepository;
import com.studentAttendance.dataModel.DataModel;
import com.studentAttendance.formData.FormData;
import com.studentAttendance.scanInRepository.ScanInRepository;
import com.studentAttendance.studentRecord.StudentRecord;
import com.studentAttendance.studentToDate.StudentToDate;
import com.studentAttendance.subjectRepository.SubjectRepository;
import com.studentAttendance.userEntity.User;
import com.studentAttendance.userRepository.UserRepository;
import com.studentAttendance.visitorEntity.Visitor;
import com.studentAttendance.visitorRepository.VisitorRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class StudentAttendanceSystemApplication {
	
	@Autowired(required = true)
	CardRepository cardRepository;
	
	@Autowired(required = true)
	ClockedInRepository clockedInRepository;
	
	@Autowired(required = true)
	ScanInRepository scanInRepository;
	
	@Autowired(required = true)
	SubjectRepository subjectRepository;
	
	@Autowired(required = true)
	UserRepository userRepository;
	
	@Autowired(required = true)  
	VisitorRepository visitorRepository;
	
	@CrossOrigin("*")
	@GetMapping("/adminList")
	public List<User> getAllAdmins(){		
		List<User> userlist = userRepository.findAll();
		return userlist;
	};
	
	@CrossOrigin("*")
	@GetMapping("/studentList")
	public List<Visitor> getAllStudent(){		
		List<Visitor> visitorList = visitorRepository.findAll();
		return visitorList;
	};
	
	@CrossOrigin("*")
	@GetMapping("/engineeringSubjects")
	public int getEngineeringSubjects(){		
		int engineeringSubjects = subjectRepository.countSubjectsByFacultyEngineering();
		return engineeringSubjects;
	};
	
	@CrossOrigin("*")
	@GetMapping("/ICTSubjects")
	public int getICTSubjects(){		
		int ICTSubjects = subjectRepository.countSubjectsByFacultyInformation();
		return ICTSubjects; 
	};
	
	@CrossOrigin("*")
	@GetMapping("/attendeesNumber")
	public int getAttendees(){		
		int attendeesNumber = clockedInRepository.countDistinctAttendeesByFaculty();
		return attendeesNumber;
	};
	 
	@CrossOrigin("*")
	@PostMapping("/trendData")
	public List<TrendData> getFacultyTrendData(@RequestBody FormData formData) {				 
	    Date startDate = formData.getStartDate();
	    Date endDate = formData.getEndDate();
	    String subject = formData.getSubject();
	    
	    System.out.println(startDate + " " + endDate + " " + subject);
	    
	    List<TrendData> trendData = clockedInRepository.getTrendData(startDate, endDate, subject);
	    
	    System.out.println(trendData);

	    return trendData;
	}
	
	@CrossOrigin("*")
    @GetMapping("/faculties")
    public List<String> getFaculties() {
		List<String> getFaculty = subjectRepository.getAllFaculties();
        return getFaculty;
    }

	@CrossOrigin("*")
    @GetMapping("/departments/{faculty}")
    public List<String> getDepartmentsForFaculty(@PathVariable String faculty) {
		List<String> getDepartment = subjectRepository.getDepartmentForFaculty(faculty);
        return getDepartment;
    }

	@CrossOrigin("*")
    @GetMapping("/subjects/{department}")
    public List<String> getSubjectsForDepartment(@PathVariable String department) {
		List<String> getSubject = subjectRepository.getSubjectForDepartment(department);
        return getSubject;
    }
	 
	@CrossOrigin("*")
	@GetMapping("/studentNumber") 
	public List<String> getAllStudentNumber(){		
		List<String> allStudentNumber = clockedInRepository.getAllStudentNumber();
		return allStudentNumber;  
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentAttendanceSystemApplication.class, args);
		System.out.println("Application Running...");
	}
	
	@CrossOrigin("*")
	@PostMapping("/studentAttendanceRate")
	public ResponseEntity<StudentRecord> getSelectedData(@RequestBody DataModel dataModel){
		String faculty = dataModel.getFaculty();
		String department = dataModel.getDepartment();
		String subject = dataModel.getSubject();
		String studentNumber = dataModel.getStudentNumber();
		
		int studentAttendanceNumber = clockedInRepository.getAttendanceNumber(subject, studentNumber);
		int subjectAvailability = clockedInRepository.getSubjectAvailability();
		double studentAttendanceRate = ((double)studentAttendanceNumber / (double)subjectAvailability) * 100;
		
		//System.out.println(studentAttendanceRate);
		StudentRecord studentRecord = new StudentRecord(faculty, department, subject, studentNumber, studentAttendanceRate);
		
        if (studentRecord != null) {
            return ResponseEntity.ok(studentRecord);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
	}
	 
	@CrossOrigin("*")
	@PostMapping("/classlistAttendance")
	public List<ClasslistData> getClasslistAttendance(@RequestBody ClasslistAttendance classlistAttendance){	
		String faculty = classlistAttendance.getFaculty();
		String department = classlistAttendance.getDepartment();
		String subject = classlistAttendance.getSubject();

		List<ClasslistData> classlistRecord = clockedInRepository.getClasslistRecord(faculty, department, subject);
		
		return classlistRecord;
	}
	
	@CrossOrigin("*")
	@PostMapping("/studentDate")
	public AttendanceRate getStudentDate(@RequestBody StudentToDate studentToDate){	
		String subject = studentToDate.getSubject();
		Date date = studentToDate.getDate(); 
		
		System.out.println(subject + " " + date);
		
		
		
		int attendanceBeforeDate = clockedInRepository.getAttendanceBeforeDate(date, subject);
		int subjectAvailabilityBeforeDate = clockedInRepository.getSubjectAvailabilityBeforeDate(date, subject);
		double studentAttendanceRate = ((double)attendanceBeforeDate / (double)subjectAvailabilityBeforeDate) * 100;
		
		AttendanceRate attendanceRate = new AttendanceRate(date, studentAttendanceRate);

		
		System.out.println(attendanceRate.getAttendanceRate() + " " + attendanceRate.getDate());
		
		return attendanceRate; 
	}
	
	@CrossOrigin("*")
	@PostMapping("/addUser")
	public ResponseEntity<String> addNewUser(@RequestParam("name") String userName, 
			@RequestParam("surname") String userSurname,
			@RequestParam("id") String userId,
			@RequestParam("number") String userNumber,
			@RequestParam("email") String userEmail,
			@RequestParam("password") String userPassword,
			@RequestParam("user_device") String userDevice,
			@RequestParam("position") String userPosition,
			@RequestParam("picture") MultipartFile pictureFile) {				 
	    try {
	        String name = userName;
	        String surname = userSurname;
	        String id = userId; 
	        String number = userNumber;
	        String email = userEmail; 
	        String password = userPassword;
	        String user_device = userDevice;
	        String position = userPosition;
	        MultipartFile picture = pictureFile;
	        byte[] pictureByte = picture.getBytes(); 
;
	        System.out.println("Received user data: " + name + ",  " + surname + ",  " + id + ",  " + number + ",  " + email + ",  " + user_device + ", " + position + ", " + pictureByte);

	        User newUser = new User(name, surname, id, number, email, password, user_device,  position, pictureByte);
	        
	        userRepository.save(newUser);

	        return ResponseEntity.status(HttpStatus.CREATED).body("User successfully added!");
	    } catch (Exception e) {
	        System.err.println("Error adding user: " + e.getMessage());
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error adding user: " + e.getMessage());
	    }
	}
	
	@CrossOrigin("*")
	@PostMapping("/removeUser")
	public ResponseEntity<String> removeUser(@RequestBody String id) {				 
	    try {

	        System.out.println("Received user data: " + id);
	        
	        userRepository.deleteById(id);

	        return ResponseEntity.status(HttpStatus.CREATED).body("User successfully removed!");
	    } catch (Exception e) {
	        System.err.println("Error adding user: " + e.getMessage());
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error adding user: " + e.getMessage());
	    }
	}
	
	@CrossOrigin("*")
	@GetMapping("/userlist")
	public List<User> getAllUsers(){		
		List<User> userlist = userRepository.findAll();
		return userlist;
	};
}
