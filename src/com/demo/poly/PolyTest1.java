package com.demo.poly;

class Animal {
	void eat() {
		System.out.println("Animal eat");
	}
	
}

class Cat extends Animal {
	@Override
	void eat() {
		System.out.println("Cat eat");
	}
}

public class PolyTest1 {
	public static void main(String args[]) {
//		parent reference will hold child object
		Animal a = new Cat(); // overriding - interface/abstract class
		
//		child reference will hold child object
		Cat c = new Cat();  // inheritance
	}

}
