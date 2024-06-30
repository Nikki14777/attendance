package com.office.attendance.infra.request;

import java.io.Serializable;
import java.time.LocalDate;


public class GetEmployeeAttendanceRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String employeeRef;
	LocalDate attendanceForDate;

	public String getEmployeeRef() {
		return employeeRef;
	}

	public void setEmployeeRef(String employeeRef) {
		this.employeeRef = employeeRef;
	}

	public LocalDate getAttendanceForDate() {
		return attendanceForDate;
	}

	public void setAttendanceForDate(LocalDate attendanceForDate) {
		this.attendanceForDate = attendanceForDate;
	}
	
	
}
