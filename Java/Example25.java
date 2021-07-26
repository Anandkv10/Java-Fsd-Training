package com.ust.examples;

 class Animels {
	String name;
	  public void eat() {
	    System.out.println("I can eat");
	  }
	}

	// inherit from Animal
	class Donkey extends Animal {

	  // new method in subclass
	  public void display() {
	    System.out.println("My name is " + name);
	  }
	}

	public class Example25 {

	public static void main( String[] args) {
		// TODO Auto-generated method stub
	    // create an object of the subclass
	    Dog labrador = new Dog();

	    // access field of superclass
	    labrador.name = "Rohu";
	    labrador.display();

	    // call method of superclass
	    // using object of subclass
	    labrador.eat();

	}

}
