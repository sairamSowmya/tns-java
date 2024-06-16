package com.org.HierarchicalInheritance;

public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("Person Details");
		System.out.println(p1);
		
		Person p;
		p = new Person("Rajeshwari","Gadag");
		if(p instanceof Person)
			System.out.println("Person details"+p);
		
		p = new Employee("Nikhil", "Mumbai", 101, 67000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student("Pankaj", "Pune", "FE", 88);
		if (p instanceof Student)
			System.out.println("Student Details "+p);
	}
}


	