package com.studentAttendance.scanInEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "scanit")
public class ScanIn {

	private String tag;
	@Id
	private String studentNumber;
	private String surname;
	private String name;
	private String ageGroup;
	private String department;
	
	ScanIn(){
		
	}
	
	ScanIn(String tag, String studentNumber, String surname, String name, String ageGroup, String department){
		this.tag = tag;
		this.studentNumber = studentNumber;
		this.surname = surname;
		this.name = name;
		this.ageGroup = ageGroup;
		this.department = department;	
	}
	
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAgeGroup() {
		return ageGroup;
	}
	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
