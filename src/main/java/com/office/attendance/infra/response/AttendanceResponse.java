package com.office.attendance.infra.response;

import java.io.Serializable;

public class AttendanceResponse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
