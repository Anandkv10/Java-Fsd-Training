package com.ust.examples;

public class MethodLocalInner {
	void outerMethod() { 
		System.out.println("Inside OuterMethod"); 
		// Inner class is local to outerMethod() 
		class Inner { 
		void innerMethod() { 
		System.out.println("Inside InnerMethod"); 
		} 
		} 
		Inner y = new Inner(); 
		y.innerMethod(); 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodLocalInner outer = new MethodLocalInner(); 
		outer.outerMethod(); 
		} 


}
