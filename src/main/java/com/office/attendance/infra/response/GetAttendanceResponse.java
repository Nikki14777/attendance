package com.office.attendance.infra.response;

import java.io.Serializable;
import java.time.LocalDate;

public class GetAttendanceResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LocalDate date;
	String employeeRef;
	float hours;
	String task;
	
	
	
	public GetAttendanceResponse(LocalDate date, String employeeRef, float hours, String task) {
		super();
		this.date = date;
		this.employeeRef = employeeRef;
		this.hours = hours;
		this.task = task;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getEmployeeRef() {
		return employeeRef;
	}
	public void setEmployeeRef(String employeeRef) {
		this.employeeRef = employeeRef;
	}
	public float getHours() {
		return hours;
	}
	public void setHours(float hours) {
		this.hours = hours;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	@Override
	public String toString() {
		return "GetAttendanceResponse [date=" + date + ", employeeRef=" + employeeRef + ", hours=" + hours + ", task="
				+ task + "]";
	}
	
	
}
