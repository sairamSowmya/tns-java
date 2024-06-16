package com.org.HierarchicalInheritance;

public class Person {
	private String name;
	private String city;
	
	public Person() {
		System.out.println("Person class default constructor");
		name="Sowmya";
		city="Bangalore";
		
	}
	public Person(String name, String city) {
		this.name=name;
		this.city=city;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
      		
	}
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city=city;
	}
	@Override
	public String toString() {
		return "Person[name=" + name + ", city= " + city + "]";
	}
}
   
	
