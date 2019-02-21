package com.sanjay.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {

	@Pattern(regexp = "[^0-9]*")
	private String studentName;
	@Past
	private Date studentDOB;

	private Long studentMobileNo;
	private List<String> studentSkills;
	@IsValidHobby(listOfValidHobies="Music|Cricket|Hockey")
	private String studentHobby;
	private Address address;

	public String getStudentHobby() {
		return studentHobby;
	}

	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public Long getStudentMobileNo() {
		return studentMobileNo;
	}

	public void setStudentMobileNo(Long studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}

	public List<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(List<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

}
