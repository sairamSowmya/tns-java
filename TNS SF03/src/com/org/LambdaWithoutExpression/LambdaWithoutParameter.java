//Program to demonstrate Lambda expression without parameters
package com.org.LambdaWithoutExpression;

public class LambdaWithoutParameter {

	public static void main(String[] args) {
		IStatement s = () -> {return "Hello World!!";};
		System.out.println(s.show());
    }

}
