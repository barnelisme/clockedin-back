package com.studentAttendance.classlistData;

public class ClasslistData {
	
	private String department;
	private String subject;
	private String studentNumber;
	
	ClasslistData(){
		
	}
	
	ClasslistData(String department, String subject, String studentNumber){
		this.setDepartment(department);
		this.setSubject(subject);
		this.setStudentNumber(studentNumber);
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
