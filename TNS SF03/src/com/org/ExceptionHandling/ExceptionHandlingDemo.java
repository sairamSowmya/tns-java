//Exception Handling by using try and catch
package com.org.ExceptionHandling;

public class ExceptionHandlingDemo {
	//Exception Handling by using try and catch

	public void Demo() { //Arthi exp
			int a = 5/0;
			System.out.println(a);
		}
		public void Slave() {
			try {
				Demo();
				
			}catch(Exception e) {
				System.out.println("Exception---->"+e); //detailed message
			}
			
		}
		
		public static void main(String[] args) {
			ExceptionHandlingDemo obj = new ExceptionHandlingDemo();
			obj.Slave();
		}

}
