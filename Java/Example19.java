package com.ust.examples;

public class Example19 {
	  String fName;
	 String IName;
	  String city;
	 String adress;
     String dob;
	float salary;
	Example19(String x, String y,String z,String a ,String b,float c)
	{
		fName=x;
		IName=y;
		city=z;
		adress=a;
		dob=b;
		salary=c;}
	

void display() {
	System.out.println(fName+""+IName+""+city+""+adress+""+dob+""+salary);
}
	public static void main(  String[] args) {
		 
		Example19 e1=new Example19("anand", "babu", "katta", "ghs", "10/2/12", 2800.0f);
		
		e1.display();

	}

}
