package com.demo.poly;

public class PolyTest {
	void test() {
		System.out.println("test method");
	}
	
	void test(String msg) {
		System.out.println("Message is " + msg);
	}
	
	int test(int no) {
		System.out.println("Message is " + no);
		return no;
	}
	
	public static void main(String args[]) {
		PolyTest p = new PolyTest();
		p.test();
		p.test(100);
		p.test("Hello");
	}

}
