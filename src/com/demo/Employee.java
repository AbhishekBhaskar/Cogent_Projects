package com.demo;

public class Employee {
	int id;
	String name;
	String address;
	String mobileNo;
	
	Employee(int id, String name, String address, String mobileNo) {	// non parameterized constructor
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public static int totalEmployees() {
		return totalEmployees++;
	}
}
