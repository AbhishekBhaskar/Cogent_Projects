package com.demo.poly;

public class FactoryTest {
	public static void main(String args[]) {
		FactoryClass factoryClass = new FactoryClass();
		Employee e = factoryClass.getEmployee("Software");
		Employee e1 = factoryClass.getEmployee("Permanent");
		Employee e2 = factoryClass.getEmployee("Contract");
		
		e.work();
		e1.work();
		e2.work();
	}

}
