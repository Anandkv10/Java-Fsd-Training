package com.ust.examples;
//abstraction
abstract class AnimalName {
	  abstract void makeSound();

	}

	class DogName extends AnimalName {

	  // implementation of abstract method
	  public void makeSound() {
	    System.out.println("Bark bark.");
	  }
	}

	class Cat extends Animal {

	  // implementation of abstract method
	  public void makeSound() {
	    System.out.println("Meows ");
	  }
	}
class Example28{


	public static void main(  String[] args) {
		 
		  
			    DogName d1 = new DogName();
			    
			    d1.makeSound();

			    Cat c1 = new Cat();
			    c1.makeSound();
			  }


	}


