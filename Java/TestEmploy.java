package com.ust.examples;

  class Employ{
	int id;
	 String name;
	float salary;
	void insert(int i,  String n, float s) {
	id=i;

	name=n;
	salary=s;
	}
	void display(){System.out.println(id+" "+name+" "+salary);}
	}
public class TestEmploy{

	public static void main( String[] args) {
		// TODO Auto-generated method stub
		 Employ e1=new Employ();
		 Employ e2=new   Employ();
		 Employ e3=new  Employ();
		e1.insert(101,"a",45000);
		e2.insert(102,"n",25000);
		e3.insert(103,"d",55000);
		e1.display();
		e2.display();
		e3.display();
	}

}
