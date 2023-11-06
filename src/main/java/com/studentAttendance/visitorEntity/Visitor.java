package com.studentAttendance.visitorEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "visitors")
public class Visitor {
	
	@Id
	private String name;
	private String phone;
	private String building;
	private String company;
	private String timeIn;
	private String timeOut;
	private String visited;
	
	Visitor(){
		
	}
	
	Visitor(String name, String phone, String building, String company, String timeIn, String timeOut, String visited){
		this.name = name;
		this.phone = phone;
		this.building = building;
		this.company = company;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
		this.visited = visited;	
	}
	
	public String getName() { 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTimeIn() {
		return timeIn;
	}
	public void setTimeIn(String timeIn) {
		this.timeIn = timeIn;
	}
	public String getTimeOut() {
		return timeOut;
	}
	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}
	public String getVisited() {
		return visited;
	}
	public void setVisited(String visited) {
		this.visited = visited;
	}
}
