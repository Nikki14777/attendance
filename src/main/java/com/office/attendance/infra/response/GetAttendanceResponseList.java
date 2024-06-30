package com.office.attendance.infra.response;

import java.io.Serializable;
import java.util.ArrayList;

public class GetAttendanceResponseList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<GetAttendanceResponse> getAttendanceResponseList;

	public ArrayList<GetAttendanceResponse> getGetAttendanceResponseList() {
		return getAttendanceResponseList;
	}

	public void setGetAttendanceResponseList(ArrayList<GetAttendanceResponse> getAttendanceResponseList) {
		this.getAttendanceResponseList = getAttendanceResponseList;
	}
	
	
}
