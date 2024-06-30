package com.office.attendance.controller.domain.businessservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.office.attendance.controller.infra.impl.IDBCall;
import com.office.attendance.controller.infra.transfromer.Transformer;
import com.office.attendance.domain.dto.Dto;

@Service
public class AttendanceService {

	private Transformer transformer;
	private IDBCall idbCall;
	
	@Autowired
	public AttendanceService(Transformer transformer, IDBCall idbCall) {
		super();
		this.transformer = transformer;
		this.idbCall = idbCall;
	}



	public Dto fillAttendanceService(Dto dto) {
		dto = transformer.transformDtoToAttendance(dto);
		System.out.println(dto.getAttendance().toString());
		dto = idbCall.saveAttendance(dto);
		return dto;
	}


	
	public Dto getEmployeeAttendanceDetails(Dto dto) {
		dto = idbCall.getEmployeeAttendanceDBCall(dto);
		return dto;
	}

}
