package com.org.Overriding;

public class OverridingDemo  {

	public static void main(String[] args) {
		RBI rbi;
		
		//Dynamic binding asssigning child class object to parent class reference variable
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());
	}
}