package com.soft2techno.demo;
public class LocalVariableTest {

	static void m1(int p) {
		//LV
		int q = 10;
		if(p ==10) {
			int r =20;

			System.out.println(p);      //10
			System.out.println(q);      //10
			System.out.println(r);       //20
		}
		System.out.println(p);           //10
		System.out.println(q);           //10
		//System.out.println(r);             //20

	}
	public static void main(String[] args) {
		System.out.println("main start");
		m1(10);
		m1(20);
		System.out.println("main end");
	}


}
