package com.soft2techno.staticmethod;

public class Test01DuplicatesVariable {
  static int a = 10;
 // int a = 10;                             //CE: duplicate field
  
  static void m1() {
	   int a = 10;          //it ia allowed to define a variable in this method block
	   //creating local variable
	   int p =20;
	   //double int p =20;           //CE: duplicate field
	   
  }
	public static void main(String[] args) {
		  int p =20;
		  String  a = "aa";
		  System.out.println("p"+p);
		

	}

}
