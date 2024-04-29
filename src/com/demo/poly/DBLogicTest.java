package com.demo.poly;

public class DBLogicTest {
	
	public static void main(String ars[]) {
		DBLogic mysqlDB = new MySqlDB();
		mysqlDB.save();
		mysqlDB.find();
		mysqlDB.update();
		mysqlDB.delete();
		
		System.out.println("");
		DBLogic mongoDB = new MongoDB();
		mongoDB.save();
		mongoDB.find();
		mongoDB.update();
		mongoDB.delete();
	}

}
