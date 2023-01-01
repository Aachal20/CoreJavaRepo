package com.soft2.staicblock;

public class Test01 {
	
	static {
		System.out.println("static block start ");
		main(null);
		m1();
		System.out.println("static block end ");
		
	}
	static void m1() {
		System.out.println("m1");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main ");
	}
	
	
	
	
	//i1
	/*
	 * static int a = m1();
	 * 
	 * //i2 static { System.out.println("a value is :: " +a);
	 * System.out.println("Static Block 1"); }
	 * 
	 * //i3 static int m1() { System.out.println("static  method"); return 0; }
	 * 
	 * //i4 public static void main(String[] args) { m1(); } //i5 static {
	 * System.out.println("a value is :: " +a);
	 * System.out.println("Static Block 2"); }
	 * 
	 * //i6 static { System.out.println("Static Block 3"); }
	 * 
	 * 
	 */

}
