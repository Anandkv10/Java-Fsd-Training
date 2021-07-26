package com.ust.examples;
import java.io.File;

public class FileNew3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // creates a file object
	    File file = new File("C:\\Users\\Guest User\\Desktop\\Java File\\List Method");

	    // returns an array of all files
	    String[] fileList = file.list();

	    for(String str : fileList) {
	      System.out.println(str);
	    }
	  }
	}

	


