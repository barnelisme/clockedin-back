package com.studentAttendance.clockedInRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentAttendance.Trend.TrendData;
import com.studentAttendance.classlistData.ClasslistData;
import com.studentAttendance.clockedInEntity.ClockedIn;

@Repository
public interface ClockedInRepository extends JpaRepository<ClockedIn, String>{
	
    @Query("SELECT COUNT(DISTINCT c.attendee) FROM ClockedIn c WHERE c.faculty = 'Engineering and the Built Environment'")
    int countDistinctAttendeesByFaculty();
    
    @Query("SELECT new com.studentAttendance.Trend.TrendData(c.date, COUNT(DISTINCT c.attendee)) FROM ClockedIn c WHERE (c.date BETWEEN :startDate AND :endDate) AND c.subjectCode = :subjectCode GROUP BY c.date")
    List<TrendData> getTrendData(
            @Param("startDate") Date startDate,
            @Param("endDate") Date endDate,
            @Param("subjectCode") String subjectCode
    );
    
	@Query("SELECT DISTINCT c.attendee FROM ClockedIn c ORDER BY c.attendee")
	List<String> getAllStudentNumber();
	
	@Query("SELECT COUNT(DISTINCT c.date) FROM ClockedIn c  WHERE subjectCode = :subject and attendee = :studentNumber")
	int getAttendanceNumber(String subject, String studentNumber);
	
	@Query("SELECT COUNT(DISTINCT c.date) FROM ClockedIn c")
	int getSubjectAvailability();

	@Query("SELECT DISTINCT NEW com.studentAttendance.classlistData.ClasslistData(c.department, c.subjectCode, c.attendee) FROM ClockedIn c WHERE c.faculty = :faculty AND c.department = :department AND c.subjectCode = :subjectCode AND c.attendee IN (SELECT DISTINCT c.attendee FROM ClockedIn c)")
	List<ClasslistData> getClasslistRecord(@Param("faculty")String faculty,
									   @Param("department")String department,
									   @Param("subjectCode")String subjectCode);
	
	@Query("SELECT COUNT(DISTINCT c.date) FROM ClockedIn c WHERE c.date <= :date AND c.subjectCode = :subjectCode")
	int getAttendanceBeforeDate(@Param("date")Date date, @Param("subjectCode")String subjectCode);
	
	@Query("SELECT COUNT(DISTINCT c.date) FROM ClockedIn c WHERE c.subjectCode = :subjectCode AND c.date <= :date")
	int getSubjectAvailabilityBeforeDate(@Param("date")Date date, @Param("subjectCode")String subjectCode);

}  
     