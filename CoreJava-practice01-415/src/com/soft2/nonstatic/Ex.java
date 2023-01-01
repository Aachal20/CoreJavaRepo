package com.soft2.nonstatic;

public class Ex {

	    public static void main(String[] args) throws ClassNotFoundException
	   
	    {
	        // get the Class instance using forName method
	        Class c1 = Class.forName("src/com/soft2/nonstatic/foo.java");
	 
	        System.out.print("Class represented by c1: "
	                         + c1.toString());
	    }
	}