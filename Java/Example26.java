package com.ust.examples;

 class Animals {
	   String name;
	  public void eat() {
	    System.out.println("I can eat");
	  }
 }
	  class Fox extends Animal {

		 
		  public void display() {
		    System.out.println("My name is " + name);
		  }
	  }
public class Example26{

	  public static void main( String[] args) {
	 Dog labrador=new Dog();
labrador.name="arjun";
labrador.display();
labrador.eat();
	}
}
 


