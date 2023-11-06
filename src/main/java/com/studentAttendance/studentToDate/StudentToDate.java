package com.studentAttendance.studentToDate;

import java.sql.Date;


public class StudentToDate {
	
	private String subject;
	private Date date;
	
	StudentToDate(){
		
	}
	
	StudentToDate(String subject, Date date){
		this.setSubject(subject);
		this.setDate(date);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
