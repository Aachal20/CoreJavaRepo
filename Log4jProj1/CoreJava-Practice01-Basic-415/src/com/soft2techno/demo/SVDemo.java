package com.soft2techno.demo;

public class SVDemo {
	static int a = m1();
	static int m1() {
		System.out.println("variable a is creted");
		return 10;
	}

	static int b = m2();
	static int m2() {
		System.out.println("variable b is creted");
		return 20;
	}

	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("a:" +a);
		System.out.println("b" +b);
}



}
