package com.studentAttendance.attendanceRate;

import java.sql.Date;

public class AttendanceRate {
	
	private Date date;
	private double attendanceRate;
	
	AttendanceRate(){
		
	}
	
	public AttendanceRate(Date date, double attendanceRate){
		this.setDate(date);
		this.setAttendanceRate(attendanceRate);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAttendanceRate() {
		return attendanceRate;
	}

	public void setAttendanceRate(double attendanceRate) {
		this.attendanceRate = attendanceRate;
	}

}
