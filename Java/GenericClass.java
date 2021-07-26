package com.ust.examples;
  class GenericClass <T extends Number> {
	public void display() {
	    System.out.println(" This is a bounded type generics class");
	  }
	
	class Main {
		  public static void main(String[] args) {

			    // create an object of GenericClass
			    GenericClass<Float> obj = new GenericClass<>();
			  }
			}

			  
			}



