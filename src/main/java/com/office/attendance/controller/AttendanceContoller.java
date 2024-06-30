package com.office.attendance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.office.attendance.controller.domain.businessservice.AttendanceService;
import com.office.attendance.domain.dto.Dto;
import com.office.attendance.infra.request.AttendanceRequest;
import com.office.attendance.infra.request.GetEmployeeAttendanceRequest;
import com.office.attendance.infra.response.AttendanceResponse;
import com.office.attendance.infra.response.GetAttendanceResponse;
import com.office.attendance.infra.response.GetAttendanceResponseList;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
@RequestMapping("/attendance")
public class AttendanceContoller {
	
	private AttendanceService attendanceService;
	
	@Autowired
	public AttendanceContoller(AttendanceService attendanceService) {
		super();
		this.attendanceService = attendanceService;
	}



	@PostMapping("/fillAttendace")
	public AttendanceResponse fillAttendance(@RequestBody AttendanceRequest attendanceRequest) {
		Dto dto = new Dto();
		dto.setAttendanceRequest(attendanceRequest);
		dto = attendanceService.fillAttendanceService(dto);
		return dto.getAttendanceResponse();
	}
	
	@PostMapping("/getAttendanceForEmployee")
	public GetAttendanceResponseList getAttendanceForEmployee(@RequestBody GetEmployeeAttendanceRequest getEmployeeAttendanceRequest) {
		Dto dto = new Dto();
		dto.setGetEmployeeAttendanceRequest(getEmployeeAttendanceRequest);
		dto = attendanceService.getEmployeeAttendanceDetails(dto);
		return dto.getGetAttendanceResponseList();
	}
	@GetMapping("/getAttendanceForEmployee1")
	public GetAttendanceResponseList getAttendanceForEmployee1(@RequestParam GetEmployeeAttendanceRequest getEmployeeAttendanceRequest) {
		Dto dto = new Dto();
		dto.setGetEmployeeAttendanceRequest(getEmployeeAttendanceRequest);
		dto = attendanceService.getEmployeeAttendanceDetails(dto);
		return dto.getGetAttendanceResponseList();
	}
	
	
}
