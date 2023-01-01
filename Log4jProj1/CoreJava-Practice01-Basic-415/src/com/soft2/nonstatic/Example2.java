package com.soft2.nonstatic;

public class Example2 {
	static int m1() {
		System.out.println("Example SV a -Variable is created");
		return 50;
	}
	static {
		System.out.println("Example SB- class is loaded");
	}
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Example main-Execution is started");

		 Class.forName("Example");
	}
	static int m2() {
		System.out.println("Example m2()");
		return 50;
	}

	public Example2() {
		System.out.println("Example2 Constructor- OBject is created");
	}
}
