//NonStaticVariableTest.java
package com.soft2techno.demo;

public class NonStaticVariableTest {
	int x =10;               //NSV
	static {
		System.out.println("SB");
	}
	{
		System.out.println("NSB");
	}

	void m1() {
		NonStaticVariableTest test2 = new NonStaticVariableTest();
		System.out.println(test2.x);              
	}
	public static void main(String[] args) {
		NonStaticVariableTest test1 = new NonStaticVariableTest();
		System.out.println(test1.x);                 //10
		//System.out.println(test2.x);
		test1.m1();                                                     //10
	}

}
