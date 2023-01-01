package com.soft2techno.demo;

public class StaticVariableTest {
	
	static int a =10;
	static{
		System.out.println("static block");
	}
	private static void m1() {
		System.out.println(a);     //10  

	}
	public static void main(String[] args) {
		System.out.println("main start");
		m1();
		System.out.println(a); 
	}

}

//main
//10
//10
