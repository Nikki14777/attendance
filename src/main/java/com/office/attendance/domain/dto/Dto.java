package com.office.attendance.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;

import com.office.attendance.domain.entity.Attendance;
import com.office.attendance.infra.request.AttendanceRequest;
import com.office.attendance.infra.request.GetEmployeeAttendanceRequest;
import com.office.attendance.infra.response.AttendanceResponse;
import com.office.attendance.infra.response.GetAttendanceResponse;
import com.office.attendance.infra.response.GetAttendanceResponseList;

public class Dto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AttendanceRequest attendanceRequest;
	private AttendanceResponse attendanceResponse;
	private Attendance attendance;
	private GetAttendanceResponse getAttendanceResponse;
	private GetEmployeeAttendanceRequest getEmployeeAttendanceRequest;
	private GetAttendanceResponseList getAttendanceResponseList;
	
	
	public GetAttendanceResponseList getGetAttendanceResponseList() {
		return getAttendanceResponseList;
	}
	public void setGetAttendanceResponseList(GetAttendanceResponseList getAttendanceResponseList) {
		this.getAttendanceResponseList = getAttendanceResponseList;
	}
	public GetAttendanceResponse getGetAttendanceResponse() {
		return getAttendanceResponse;
	}
	public void setGetAttendanceResponse(GetAttendanceResponse getAttendanceResponse) {
		this.getAttendanceResponse = getAttendanceResponse;
	}
	public GetEmployeeAttendanceRequest getGetEmployeeAttendanceRequest() {
		return getEmployeeAttendanceRequest;
	}
	public void setGetEmployeeAttendanceRequest(GetEmployeeAttendanceRequest getEmployeeAttendanceRequest) {
		this.getEmployeeAttendanceRequest = getEmployeeAttendanceRequest;
	}
	public Attendance getAttendance() {
		return attendance;
	}
	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}
	public AttendanceRequest getAttendanceRequest() {
		return attendanceRequest;
	}
	public void setAttendanceRequest(AttendanceRequest attendanceRequest) {
		this.attendanceRequest = attendanceRequest;
	}
	public AttendanceResponse getAttendanceResponse() {
		return attendanceResponse;
	}
	public void setAttendanceResponse(AttendanceResponse attendanceResponse) {
		this.attendanceResponse = attendanceResponse;
	}
	@Override
	public String toString() {
		return "Dto [attendanceRequest=" + attendanceRequest + ", attendanceResponse=" + attendanceResponse
				+ ", attendance=" + attendance + ", getAttendanceResponse=" + getAttendanceResponse
				+ ", getEmployeeAttendanceRequest=" + getEmployeeAttendanceRequest + ", getAttendanceResponseList="
				+ getAttendanceResponseList + "]";
	}
	
	
	
}
