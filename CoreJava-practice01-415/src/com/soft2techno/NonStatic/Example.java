package com.soft2techno.NonStatic;

public class Example {
  int a = 10;
  int b = 20;
  
	public static void main(String[] args) {
		
	  Example e = new Example();

	  System.out.println("a value:" + e.a); //10
	  System.out.println("b value:" + e.b); //20
	  e.a = 50;
	  e.b = 60;
	  System.out.println("a value:" + e.a);
	  System.out.println("a value:" + e.b);
	  System.out.println("---------------------");
	  
	  Example e1 = new Example();
	  System.out.println("a value:" + e1.a); //10
	  System.out.println("b value:" + e1.b); //20
	  System.out.println("a value:" + e1.a);
 }

}
