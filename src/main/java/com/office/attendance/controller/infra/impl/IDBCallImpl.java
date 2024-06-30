package com.office.attendance.controller.infra.impl;

import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.office.attendance.domain.dto.Dto;
import com.office.attendance.infra.repository.IAttendace;
import com.office.attendance.infra.response.AttendanceResponse;
import com.office.attendance.infra.response.GetAttendanceResponse;
import com.office.attendance.infra.response.GetAttendanceResponseList;

@Service
public class IDBCallImpl implements IDBCall {
	private IAttendace iAttendace;

	
	@Autowired
	public IDBCallImpl(IAttendace iAttendace) {
		super();
		this.iAttendace = iAttendace;
	}



	@Override
	public Dto saveAttendance(Dto dto) {
		// TODO Auto-generated method stub
		iAttendace.save(dto.getAttendance());
		AttendanceResponse a = new AttendanceResponse();
		a.setStatus("Attendance Filled Successfully");
		dto.setAttendanceResponse(a);;
		return dto;
	}



	@Cacheable(value = "employeeAttendance", key = "#dto.getEmployeeAttendanceRequest.employeeRef")
	@Override
	public Dto getEmployeeAttendanceDBCall(Dto dto) {
		System.out.println("**********into the method*******************");

		LocalDate startDate = dto.getGetEmployeeAttendanceRequest().getAttendanceForDate().withDayOfMonth(1);
		System.out.println(startDate);
		int year = startDate.getYear();
	    int month = startDate.getMonthValue();
	    YearMonth yearMonth = YearMonth.of(year, month);
	    int daysInMonth = yearMonth.lengthOfMonth();
		LocalDate endDate = dto.getGetEmployeeAttendanceRequest().getAttendanceForDate().withDayOfMonth(daysInMonth);
		ArrayList<GetAttendanceResponse> getAttendanceResponseList = iAttendace.getEmployeeAttendance(dto.getGetEmployeeAttendanceRequest().getEmployeeRef(), startDate,endDate );
		GetAttendanceResponseList getAttendanceResponseList2 = new GetAttendanceResponseList();
		getAttendanceResponseList2.setGetAttendanceResponseList(getAttendanceResponseList);
		dto.setGetAttendanceResponseList(getAttendanceResponseList2);
		return dto;
	}

}
