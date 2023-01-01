package com.soft2techno.staticmethod;

public class Test05StaticMethods {
	
	static void m1() {
		System.out.println("In m1");
	}
	
	static void m2() {
		System.out.println("In m2 ");
		int m=10;
		int n=20;
	System.out.println("m value" +m);
		System.out.println("n value:" +n);
		System.out.println("In m2 end");
	}
	
	static void m3() {
		System.out.println("In m3");
		int m=10;
		int n=20;
	}
	public static void main(String[] args) {
		System.out.println("main start");
		m1();
		m2();
		
		
		int m = 50;
		int n = 60;
		
		System.out.println("m value" +m);
		System.out.println("n value:" +n);
		
		System.out.println("main end");
	}
}

//main start
//in m1
//In m2
//In m2 end
//main end

