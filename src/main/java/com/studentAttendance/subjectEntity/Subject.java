package com.studentAttendance.subjectEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "subjects")
public class Subject {
	
	private String subjectName;
	@Id
	private String subjectCode;
	private String subjectCredit;
	private String department;
	private String faculty;
	private String semesterType;
	
	Subject(){
		
	}
	
	Subject(String subjectCode, String faculty, String department){
		this.subjectCode = subjectCode;
		this.faculty = faculty;
		this.department = department;
	}
	
	Subject(String subjectName, String subjectCode, String subjectCredit, 
			String department, String faculty, String semesterType){
		this.subjectName = subjectName;
		this.subjectCode = subjectCode;
		this.subjectCredit = subjectCredit;
		this.department = department;
		this.faculty = faculty;
		this.semesterType = semesterType;
		
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectCredit() {
		return subjectCredit;
	}
	public void setSubjectCredit(String subjectCredit) {
		this.subjectCredit = subjectCredit;
	}
	public String getDepartement() {
		return department;
	}
	public void setDepartement(String department) {
		this.department = department;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getSemesterType() {
		return semesterType;
	}
	public void setSemesterType(String semesterType) {
		this.semesterType = semesterType;
	}
}
