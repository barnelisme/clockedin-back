package com.studentAttendance.Trend;

import java.sql.Date;

public class TrendData {
	
    private Date date;
    private Long attendeeCount;
    
    public TrendData() {
    	
    }
    
    public TrendData(Date date, Long attendeeCount) {
        this.setDate(date);
        this.setAttendeeCount(attendeeCount);
    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getAttendeeCount() {
		return attendeeCount;
	}

	public void setAttendeeCount(Long attendeeCount) {
		this.attendeeCount = attendeeCount;
	}

}
