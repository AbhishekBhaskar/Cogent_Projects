package com.demo;

public class TestExample {

	public static void main(String args[]) {
		//	object call constructor
		Employee e = new Employee();
		
		e.setId(101);
		e.setName("Akhil");
		e.setAddress("101,New str");
		e.setMobileNo("2001312");
		
		System.out.println(e.getId() + ", " + e.getName() + ", " + e.getAddress() + ", " + e.getMobileNo());
		
//		e1 = reference variable
		Employee e1 = new Employee();
	}
}
