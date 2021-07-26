package com.ust.examples;

interface Animalss {
	  public void animalSound(); // interface method (does not have a body)
	  public void sleep(); // interface method (does not have a body)
	}

	// Pig "implements" the Animal interface
	class Pig implements Animalss {
	  public void animalSound() {
	    // The body of animalSound() is provided here
	    System.out.println("The pig says: wee wee");
	  }
	  public void sleep() {
	    // The body of sleep() is provided here
	    System.out.println("Zzz");
	  }
	}



public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig myPig = new Pig();  // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep();
	  }
	


	}


