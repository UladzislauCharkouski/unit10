package com.epam.unit10.main;

import java.util.Objects;

public class Student {
	private int id;
	private String surName;
	private String firstName;
	private String middleName;
	private String birthdayDate;
	private String address;
	private int phone;
	private String faculty;
	private int course;
	
	public Student (int id, String surName, String firstName, String middleName, String birthdayDate, String address, int phone, String faculty, int course) {
		this.id = id;
		this.surName = surName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.birthdayDate = birthdayDate;
		this.address = address;
		this.phone = phone;
		this.faculty = faculty;
		this.course = course;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public void setBirthdayDate(String birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	public void setCourse(int course) {
		this.course = course;
	}
	
	public int getId() {
		  return id;
	}
		 
	public String getSurName() {
		  return surName;
	}
		 
	public String getFirstName() {
		  return firstName;
	}
	
	public String getMiddleName() {
		  return middleName;
	}
	
	public String getBirthdayDate() {
		  return birthdayDate;
	}
	
	public String getAddress() {
		  return address;
	}
	
	public int getPhone() {
		  return phone;
	}
	
	public String faculty() {
		  return faculty;
	}
	
	public int getCourse() {
		  return course;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (null == obj) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Student student = (Student) obj;
		
		if (id != student.id) {
			return false;
		}
		if (surName != student.surName) {
			return false;
		}
		if (firstName != student.firstName) {
			return false;
		}
		if (middleName != student.middleName) {
			return false;
		}
		if (birthdayDate != student.birthdayDate) {
			return false;
		}
		if (address != student.address) {
			return false;
		}
		if (phone != student.phone) {
			return false;
		}
		if (faculty != student.faculty) {
			return false;
		}
		if (course != student.course) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, surName, firstName, middleName, birthdayDate, address, phone, faculty, course);
	}
}
