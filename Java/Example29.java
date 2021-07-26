package com.ust.examples;

public class Example29 {
	 final static  String NAME = "CONFIG";
	 final long initTime;
	 Example29()
	 { 
		 this.initTime = System.currentTimeMillis(); } 

public static void main( String []args) {
	Example29 cfg1=new Example29();
	System.out.println(cfg1.initTime);
	Example29 cfg2= new Example29();
	System.out.println(cfg2.initTime);}}
