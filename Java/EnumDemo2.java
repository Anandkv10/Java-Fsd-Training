package com.ust.examples;
enum Directions2{
	  EAST, 
	  WEST, 
	  NORTH, 
	  SOUTH
}

public class EnumDemo2 {


	   Directions dir;
	   public EnumDemo2(Directions dir) {
	      this.dir = dir;
	   }
	   public void getMyDirection() {
	     switch (dir) {
	       case EAST:
	          System.out.println("In East Direction");
	          break;
	                    
	       case WEST:
	          System.out.println("In West Direction");
	          break;
	                         
	       case NORTH: 
	          System.out.println("In North Direction");
	          break;
	                        
	       default:
	          System.out.println("In South Direction");
	          break;
	     }
	   }
	    
	    public static void main(String[] args) {
	        EnumDemo2 obj1 = new EnumDemo2(Directions.EAST);
	        obj1.getMyDirection();
	        EnumDemo2 obj2 = new EnumDemo2(Directions.SOUTH);
	        obj2.getMyDirection();
	    }


	}


