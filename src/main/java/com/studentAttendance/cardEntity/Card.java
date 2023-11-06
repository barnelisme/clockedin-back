package com.studentAttendance.cardEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "card_id")
public class Card {
	
	@Id
	private String tag;
	private String studentNumber;
	private String surname;
	private String name;
	
	Card(){
		
	}
	
	Card(String tag, String studentNumber, String surname, String name){
		this.tag = tag;
		this.studentNumber = studentNumber;
		this.surname = surname;
		this.name = name;
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
}
