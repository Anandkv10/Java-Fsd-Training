package com.ust.examples;

 class Animal {
	  String name;
	  public void eat() {
	    System.out.println("I can eat");
	  }
 }
	  class Dog extends Animal {

		 
		  public void display() {
		    System.out.println("My name is " + name);
		  }
	  }
 class example{

	  public static void main( String[] args) {
	 Dog labrador=new Dog();
labrador.name="arjun";
labrador.display();
labrador.eat();
	}
 }
 


