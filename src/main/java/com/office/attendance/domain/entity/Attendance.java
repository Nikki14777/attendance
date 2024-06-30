package com.office.attendance.domain.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Attendance {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
	
	String employeeRef;
	LocalDate date;
	float hours;
	String task;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployeeRef() {
		return employeeRef;
	}
	public void setEmployeeRef(String employeeRef) {
		this.employeeRef = employeeRef;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
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
		return "Attendance [id=" + id + ", employeeRef=" + employeeRef + ", date=" + date + ", hours=" + hours
				+ ", task=" + task + "]";
	}
	
	
}
