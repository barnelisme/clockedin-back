package com.studentAttendance.dataModel;

public class DataModel {
	
	private String faculty;
	private String department;
	private String subject;
	private String studentNumber;
	
	DataModel(){
		
	}
	
	DataModel(String faculty, String department, String subject, String studentNumber){
		this.setFaculty(faculty);
		this.setDepartment(department);
		this.setSubject(subject);
		this.setStudentNumber(studentNumber);
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

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}
