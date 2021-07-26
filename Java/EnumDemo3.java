package com.ust.examples;
  enum Directions3{
  EAST, 
  WEST,  
  NORTH,  
  SOUTH, 
  ; 
  private String shortCode = "";
	  
  void Directions(String code) {
      this.shortCode = code;
  }
	  
  public String getDirectionCode() {
      return this.shortCode;
  }
}
public class EnumDemo3
{
    public static void main(String[] args) {
    	Directions dir = Directions.SOUTH;
    	System.out.println(dir.getDirectionCode());
    	Directions dir2 = Directions.EAST;
    	System.out.println(dir2.getDirectionCode());
    }
}
