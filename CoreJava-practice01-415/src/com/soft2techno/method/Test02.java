package com.soft2techno.method;
//SM & NSM
public class Test02 {

	private static void m1() {
		System.out.println("m1 execute");
	}
	
	void m2() {
		System.out.println("m2 execute");
	}

	public static void main(String[] args) {
		System.out.println("--------In Main start -------");

		m1();
		//m2();         //non-static variable cannot be reference from static context

		//Here we used new kw to provide memory for m2() method
		Test02 test = new Test02();
		//it gets memory with reference as test variable.
		test.m2();
		System.out.println("-------In Main end------");
	}
}
