package com.studentAttendance.classlistResponse;

import java.util.List;

import com.studentAttendance.clockedInEntity.ClockedIn;

public class Response {
	
    private List<ClockedIn> classlistRecord;
    private double studentAttendanceRate;
    
    Response(){
    	
    }
    
    public Response(List<ClockedIn> classlistRecord, double studentAttendanceRate){
    	this.setClasslistRecord(classlistRecord);
    	this.setStudentAttendanceRate(studentAttendanceRate);
    }
	public List<ClockedIn> getClasslistRecord() {
		return classlistRecord;
	}
	public void setClasslistRecord(List<ClockedIn> classlistRecord) {
		this.classlistRecord = classlistRecord;
	}
	public double getStudentAttendanceRate() {
		return studentAttendanceRate;
	}
	public void setStudentAttendanceRate(double studentAttendanceRate) {
		this.studentAttendanceRate = studentAttendanceRate;
	}

}
