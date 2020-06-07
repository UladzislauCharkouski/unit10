package com.epam.unit10.main;

import java.util.Objects;

public class Customer {
	private int id;
	private String surName;
	private String firstName;
	private String middleName;
	private String address;
	private int creditCardNumber;
	private int bankAccountNumber;
	
	public Customer (int id, String surName, String firstName, String middleName, String address, int creditCardNumber, int bankAccountNumber) {
		this.id = id;
		this.surName = surName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
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
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
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
	
	public String getAddress() {
		  return address;
	}
	
	public int getCreditCardNumber() {
		  return creditCardNumber;
	}
	
	public int getBankAccountNumber() {
		  return bankAccountNumber;
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
		
		Customer customer = (Customer) obj;
		
		if (id != customer.id) {
			return false;
		}
		if (surName != customer.surName) {
			return false;
		}
		if (firstName != customer.firstName) {
			return false;
		}
		if (middleName != customer.middleName) {
			return false;
		}
		if (address != customer.address) {
			return false;
		}
		if (creditCardNumber != customer.creditCardNumber) {
			return false;
		}
		if (bankAccountNumber != customer.bankAccountNumber) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, surName, firstName, middleName, address, creditCardNumber, bankAccountNumber);
	}
}
