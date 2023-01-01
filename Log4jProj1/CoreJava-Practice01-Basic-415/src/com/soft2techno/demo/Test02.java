package com.soft2techno.demo;

public class Test02 {
	static void m1() {
		System.out.println("m1 is start");
		int x =50;
		System.out.println("x vslue::"+x);
		m2(x);
		System.out.println("m1 is end");
	}

	static void m2(int x) {
		System.out.println("m2 is start");
      int q = x+10;
      System.out.println(q);
      System.out.println("m2 is end");

	}

	public static void main(String[] args) {
		System.out.println("main start");
		m1();
		System.out.println("main end");
	}

}
