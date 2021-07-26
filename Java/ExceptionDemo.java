package com.ust.examples;

public class ExceptionDemo {

	public static void main(String[] args) {
		 int x=5;
		 int y=0;
		 
		 
		 try {
		      int divideByZero = 5 / 0;
		 }
		 catch(ArithmeticException e) {
		 System.out.println("not possible to devide by zero");
		 }
	 
	 finally {
		System.out.println("finally block will executed");
	 }
	}
}
 
 
 
 