package com.ust.examples;
class base 
{ 
     final void display() 
     { 
       System.out.println("base method called"); 
      } 
} 
   class Derived extends base 
   {
  
	   //void display()//
	   
	   { 
       System.out.println("base method called"); 
     } 
   
  


 public class FinalMethod {

	public static void main( String[] args) {
		 
		Derived d =new Derived(); 
        d.display(); 
	}
	}
 }

   
