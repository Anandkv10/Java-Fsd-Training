package com.ust.examples;

 
 
	public class NestedInner {
		class Inner{
			public void show() {
				System.out.println("nested class method");
			}
		
		}
	 	         
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedInner.Inner in = new NestedInner().new Inner(); 
		in.show(); 
		} 

	}



