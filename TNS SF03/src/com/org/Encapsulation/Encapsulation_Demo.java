package com.org.Encapsulation;

public class Encapsulation_Demo {

	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
		obj.setAge(20);
		obj.setName("Sowmya");
		obj.setSerialNum(89);
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getSerialNum());

	}

}