package com.soft2techno.staticmethod;

public class Test_Example2 {

	static int a = m1();
	
	
	private static int m1() {
		System.out.println("Variable a is created");
		return 10;
	}

	private static int m2() {
		System.out.println("Variable b is created");
		return 20;
	}
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("a::" +a); //10
		System.out.println("b::"+b); //20
	}
	
	static int b = m2();	
}
