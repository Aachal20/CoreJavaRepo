package com.soft2techno.method;
//static method
public class Test01 {

	private static void m2() {
		System.out.println("m2 execute");
	}
	private static void m1() {
		System.out.println("m1 execute");

	}
	
	public static void main(String[] args) {
		m1();
		m2();
	}


}
