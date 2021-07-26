package com.ust.examples;

class Patient{
 private   String name;
private int age;
private boolean vaccinestatus;
 
 
public  String getName() {
	return name;
}
public void setName( String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isvaccinestatus() {
	return vaccinestatus;
}
public void setvaccinestatus(boolean vaccinestatus) {
	this.vaccinestatus= vaccinestatus;
	
	if(vaccinestatus==true) {
		System.out.println("done a good job");
	}
	else {
		System.out.println("please got vaccinates");
	}
}
 
 
}


public class Encapsulation {

	public static void main( String[] args) {
		 Patient p=new Patient();
		  p.setvaccinestatus(true);
		  System.out.println(p.isvaccinestatus());
	}
}
