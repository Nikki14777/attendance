package com.office.attendance.controller.infra.impl;

import org.springframework.stereotype.Service;

import com.office.attendance.domain.dto.Dto;

@Service
public interface IDBCall {

	Dto saveAttendance(Dto dto);

	Dto getEmployeeAttendanceDBCall(Dto dto);
}
