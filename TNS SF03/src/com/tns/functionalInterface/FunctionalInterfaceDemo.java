package com.tns.functionalInterface;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		GreetClass g= new GreetClass();
		System.out.println(g.greet());
		
		//using lambda expression
		//short block of code
		//Lambda takes in the parameter and returns the value
		//similar to method but do not need any name,they can be starightaway implemented in the body of a main
		// () parameter -> expression  =  syntax
		
		GreetInterface g1=() -> {
			return "Good Afternoon";
		};
		System.out.println(g1.greet());

	}

}
