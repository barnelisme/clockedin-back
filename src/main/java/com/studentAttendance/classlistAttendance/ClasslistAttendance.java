package com.studentAttendance.classlistAttendance;

import java.sql.Date;

public class ClasslistAttendance {
	
	private String faculty;
	private String department;
	private String subject;
	private Date date;
	
	ClasslistAttendance(){
		
	}
	
	ClasslistAttendance(String faculty, String department, String subject, Date date){
		this.setFaculty(faculty);
		this.setDepartment(department);
		this.setSubject(subject);
		this.setDate(date);
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
