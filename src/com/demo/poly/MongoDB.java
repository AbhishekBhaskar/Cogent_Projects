package com.demo.poly;

public class MongoDB implements DBLogic {
	
	@Override()
	public void save() {
		System.out.println("Mongo save");
	}
	
	@Override()
	public void update() {
		System.out.println("Mongo update");
	}
	
	@Override()
	public void find() {
		System.out.println("Mongo find");
	}
	
	@Override()
	public void delete() {
		System.out.println("Mongo delete");
	}
}
