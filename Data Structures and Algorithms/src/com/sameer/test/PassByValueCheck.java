package com.sameer.test;

public class PassByValueCheck {

	public static void main(String args[]) {
		
		int var = 5;
		PassByValueCheckEntity entity = new PassByValueCheckEntity();
		entity.setAge(10);
		modifyEntity(entity);
		increase(var);
		System.out.println("var in main"+var);
		System.out.println(entity.getAge());
	}
	
	public static void increase(int var) {
		var++;
		System.out.println("var in function"+var);
	}
	
	public static void modifyEntity(PassByValueCheckEntity entity) {
		entity.setAge(20);
	}
}
