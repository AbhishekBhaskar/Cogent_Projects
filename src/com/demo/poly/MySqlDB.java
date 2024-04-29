package com.demo.poly;

public class MySqlDB implements  DBLogic {
	public void save() {
		System.out.println("Mysql save");
	}
	
	public void update() {
		System.out.println("Mysql update");
	}
	
	public void find() {
		System.out.println("Mysql find");
	}
	
	public void delete() {
		System.out.println("Mysql delete");
	}
}
