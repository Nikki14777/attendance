package com.office.attendance.infra.repository;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.office.attendance.domain.entity.Attendance;
import com.office.attendance.infra.response.GetAttendanceResponse;


@Repository
public interface IAttendace extends JpaRepository<Attendance, Long>{
	
	@Query("SELECT new com.office.attendance.infra.response.GetAttendanceResponse"
    		+ "(e.date, e.employeeRef, e.hours, e.task) "
    		+ "FROM Attendance e WHERE e.employeeRef = :employeeRef AND e.date BETWEEN :startDate AND :endDate")
    ArrayList<GetAttendanceResponse> getEmployeeAttendance( @Param("employeeRef") String employeeRef,
    @Param("startDate") LocalDate startDate,
    @Param("endDate") LocalDate endDate);
	
}
//LocalDate date;
//String employeeRef;
//float hours;
//String task;
