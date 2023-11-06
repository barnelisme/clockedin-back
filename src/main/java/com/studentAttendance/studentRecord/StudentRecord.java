package com.studentAttendance.studentRecord;

public class StudentRecord {
	
	private String faculty;
	private String department;
	private String subject;
	private String studentNumber;
	private double attendanceRate;
	
	StudentRecord(){
		
	}
	
	public StudentRecord(String faculty, String department, String subject, String studentNumber, double attendanceRate){
		this.setFaculty(faculty);
		this.setDepartment(department);
		this.setSubject(subject);
		this.setStudentNumber(studentNumber);
		this.setAttendanceRate(attendanceRate);
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

	public double getAttendanceRate() {
		return attendanceRate;
	}

	public void setAttendanceRate(double attendanceRate) {
		this.attendanceRate = attendanceRate;
	}

}
