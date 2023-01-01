package com.soft2techno.method;
//Static void method &  Static non-void method
public class Test03 {

	static void m1() {                            //static void non-parameterized  method                        
		System.out.println("m1 execute");
		return;
	}
	static int  m2(int x) {                           //static void parameterized  method
		System.out.println("m2 execute");
		return x; //50


	}

	public static void main(String[] args) {
		m1();


	m2(50);
	int x = m2(50);
	System.out.println(x);
	
	System.out.println(m2(100));
		
		
		
		
		
		
		
	

	}

}
