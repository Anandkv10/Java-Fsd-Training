package com.ust.examples;

public class Example2 {
int price;
 String item;

	public static void main( String[] args) {
		// TODO Auto-generated method stub
Example2 e1= new Example2();
Example2 e2= new Example2();

e1.price=20;
e2.price=30;
e1.item="pen";
e2.item="book";
if(e1.price>e2.price) {
	e1.item="scale";
}
if(e1.price<e2.price) {
	e1.item="pencil";
}
else {
	e1.item="box";
	
}
System.out.println(e1.item);
	};

}
