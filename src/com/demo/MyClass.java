package com.demo;


class Test {
	public static void test() {
		System.out.println("Test test");
	}
}

public class MyClass {
	
	public static int myClasstest() {
		System.out.println("my class test");
		return 100;
	}
	
	public static int test() {
		System.out.println("test");
		return 100;
	}

	public static void main(String args[]) {	// JVM will start execution from here
		System.out.println("main");
//		Test.test();	// call of test method
		int x = test();
		System.out.println(x);
		
		int arr[] = {1,2,3,4,5,6,7};
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//		MyClass.test();
	}	// JVM will end execution here
}
