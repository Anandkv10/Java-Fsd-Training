package com.ust.examples;

  
	class Super_class {
		   int num = 20;

		   // display method of superclass
		   public void display() {
		      System.out.println("This is the display method of superclass");
		   }
		}

		public class  Example27 extends Super_class {
		   int num = 10;

		   // display method of sub class
		   public void display() {
		      System.out.println("This is the display method of subclass");
		   }

		   public void my_method() {
		      // Instantiating subclass
		     Example27  e = new Example27();

		      // Invoking the display() method of sub class
		      e.display();

		      // Invoking the display() method of superclass
		      super.display();

		      // printing the value of variable num of subclass
		      System.out.println("value of the variable named num in  e class:"+  e.num);

		      // printing the value of variable num of superclass
		      System.out.println("value of the variable named num in super class:"+ super.num);
		   }

	public static void main( String[] args) {
		// TODO Auto-generated method stub
		  Example27 obj = new  Example27();
	      obj.my_method();

	}

}
