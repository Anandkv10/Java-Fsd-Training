package com.ust.examples;

class Person{
	
	int phone;
	String name;
	
	public void showDetails() {
		System.out.println(name);
		System.out.println(phone);
		
	}
}
class Teacher extends Person{
	
}
class Staff extends Person{
	
}
class Studentss extends Person{
	
}
public class ExampleInheritance {

	public static void main(String[] args) {
		 
		 Teacher t1=new Teacher();
		t1.name="anand";
		t1.phone=98765432;
		t1.showDetails();
Staff s1=new Staff();
s1.name="biju";
s1.phone=67863535;
s1.showDetails();

Studentss st1=new Studentss();
st1.name="ammu";
st1.phone=87654321;
st1.showDetails();
	}

}
