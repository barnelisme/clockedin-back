package com.studentAttendance.formData;

import java.sql.Date;

public class FormData {
	
    private Date startDate;
    private Date endDate;
    private String subjectCode;
    
    public FormData() {
    	
    }
    
    public FormData(Date startDate, Date endDate, String subjectCode) {
    	this.setStartDate(startDate);
    	this.setEndDate(endDate);
    	this.setSubject(subjectCode);
    }

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getSubject() {
		return subjectCode;
	}

	public void setSubject(String subjectCode) {
		this.subjectCode = subjectCode;
	}

}
