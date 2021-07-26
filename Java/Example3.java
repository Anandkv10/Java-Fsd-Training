package com.ust.examples;
/*
 * 
 * example for loop
 */
public class Example3 {

	public static void main( String[] args) {
		// TODO Auto-generated method stub
//String[] str=new String[5];
  String [] str= {"messi","iniesta","maldini","kaka","buffon"};

for(int i=0;i<str.length;i++) {
	
	if (str[i].equals( "neymar"))
		continue;
	System.out.println(str[i]);
}
	}

}
