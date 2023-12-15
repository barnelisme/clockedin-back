package com.studentAttendance.subjectEntity;

public class SubjectModel {
	
	private String faculty;
	private Long facultyNumber;
	private Long department;
	private Long subjectCode;
	
	public SubjectModel(){
		
	}
	
	public SubjectModel(String faculty, Long facultyNumber, Long department, Long subjectCode) {
		this.faculty = faculty;
		this.facultyNumber = facultyNumber;
		this.department = department;
		this.subjectCode = subjectCode; 
	}
	
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public Long getDepartment() {
		return department;
	}
	public void setDepartment(Long department) {
		this.department = department;
	}
	public Long getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(Long subjectCode) {
		this.subjectCode = subjectCode;
	}

	public Long getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(Long facultyNumber) {
		this.facultyNumber = facultyNumber;
	}

}
