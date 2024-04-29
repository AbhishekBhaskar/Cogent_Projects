package com.demo.poly;

public abstract class MyClass {
	
	int firstIndex;
	int secondIndex;

	public MyClass() {
		
	}
	
	public MyClass(int firstIndex, int secondIndex) {
		super();
		this.firstIndex = firstIndex;
		this.secondIndex = secondIndex;
		
	}
	
	abstract void test();
	
	void test1() {
		System.out.println(firstIndex + ", " + secondIndex);
	}
}
