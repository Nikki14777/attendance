package com.office.attendance.controller.infra.transfromer;

import org.springframework.stereotype.Service;

import com.office.attendance.domain.dto.Dto;
import com.office.attendance.domain.entity.Attendance;

@Service
public class Transformer {

	public Dto transformDtoToAttendance(Dto dto) {
		Attendance attendance = new Attendance();
		attendance.setDate(dto.getAttendanceRequest().getDate());
		attendance.setEmployeeRef(dto.getAttendanceRequest().getEmployeeRef());
		attendance.setHours(dto.getAttendanceRequest().getHours());
		attendance.setTask(dto.getAttendanceRequest().getTask());
		dto.setAttendance(attendance);
		return dto;
	}
}
