package com.demo.poly;

public class MyClass1 extends MyClass {
	
	public MyClass1() {
		super(1, 50);
		firstIndex = 100;
		secondIndex = 200;
	}
	
	@Override()
	void test() {
		
	}
	
	@Override()
	protected void test1() {
		System.out.println(firstIndex + ", " + secondIndex);
	}
}
