//Program to demonstrate user defined generic class
package com.org.GenericDemo;

//Generic Class
class GenericClass<T> {
	T data;
	void set(T data)
	{
		this.data=data;
	}
	
	T get()
	{
		return data;
	}


}
