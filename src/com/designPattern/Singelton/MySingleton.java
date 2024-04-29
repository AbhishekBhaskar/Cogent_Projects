package com.designPattern.Singelton;

class Address {
	
	private static Address address;
	private Address() {
		
	}
	
	public static Address getInstance() {
		if (address == null) {
			address = new Address();
		}
		return address;
	}
	
}

public class MySingleton {

	public static void main(String args[]) {
		Address a = Address.getInstance();
		Address a1 = Address.getInstance();
		Address a2 = Address.getInstance();
		
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}
	
}
