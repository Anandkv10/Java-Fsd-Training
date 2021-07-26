package com.ust.examples;

public class Student {
	  String name;
    int id;
	public String rollno;
    Student( String  name, int id) 
    { 
    this.name = name; 
    this.id = id; 
    }
     
	public static void main( String[] args) {
		 
		Student student1 = new Student("Ashok", 101); 
		System.out.println("Student Name: " + student1.name + " and Student Id: " + student1.id); 
		}
    
	}

	
