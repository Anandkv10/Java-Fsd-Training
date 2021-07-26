package com.ust.examples;

abstract class Person1 {
	abstract void eat();  
}  
 	  class TestAnonymous{  

	public static void main(String[] args) {
	 
		Person1 p1=new Person1(){  
		 	  void eat()
		 	  {System.out.println("nice fruits");}  
		 	  };
			 	  p1.eat();  
		   
			  

	}

}
