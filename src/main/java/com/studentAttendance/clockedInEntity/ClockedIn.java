package com.studentAttendance.clockedInEntity;

import java.sql.Date;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clockedin")
public class ClockedIn {
	
	private String user;
	private String tag;
	@Id
	private String attendee;
	private Date timestamp;
	private String weekday;
	private Time time;
	private String hour;
	private Date date;
	private String faculty;
	private String department;
	private String subjectCode;
	
	private long attendeeCount;
	
	ClockedIn(){
		
	}
	
	ClockedIn(Date date, int attendeeCount){
        this.date = date;
        this.attendeeCount = attendeeCount;
	}
	
	ClockedIn(String department, String subjectCode, String attendee){
		this.department = department;
		this.subjectCode = subjectCode;
		this.attendee = attendee;
	}
	
	ClockedIn(String user, String tag, String attendee, Date timestamp, 
			String weekday, Time time, String hour, Date date, String faculty, 
			String department, String subjectCode){
		this.user = user;
		this.tag = tag;
		this.attendee = attendee;
		this.timestamp = timestamp;
		this.weekday = weekday;
		this.time = time;
		this.hour = hour;
		this.date = date;
		this.faculty = faculty;
		this.department = department;
		this.subjectCode = subjectCode;
		
	}
	
	ClockedIn(String attendee){
		this.attendee = attendee;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getAttendee() {
		return attendee;
	}
	public void setAttendee(String attendee) {
		this.attendee = attendee;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getWeekday() {
		return weekday;
	}
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public long getAttendeeCount() {
		return attendeeCount;
	}

	public void setAttendeeCount(long attendeeCount) {
		this.attendeeCount = attendeeCount;
	}

}
