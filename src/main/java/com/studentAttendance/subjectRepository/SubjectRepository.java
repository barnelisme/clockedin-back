package com.studentAttendance.subjectRepository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studentAttendance.subjectEntity.Subject;


@Repository
public interface SubjectRepository extends JpaRepository<Subject, String>{
	
    @Query("SELECT DISTINCT COUNT(s) FROM Subject s WHERE s.faculty = 'Engineering and the Built Environment'")
    int countSubjectsByFacultyEngineering();
    
    @Query("SELECT DISTINCT COUNT(s) FROM Subject s WHERE s.faculty = 'Information and Communication Technology'")
    int countSubjectsByFacultyInformation();
    
	@Query("SELECT DISTINCT s.faculty FROM Subject s")
	List<String> getAllFaculties();

	@Query("SELECT DISTINCT s.department FROM Subject s WHERE s.faculty = :faculty")
	List<String> getDepartmentForFaculty(String faculty); 

	@Query("SELECT DISTINCT s.subjectCode FROM Subject s WHERE s.department = :department")
	List<String> getSubjectForDepartment(String department);

}
