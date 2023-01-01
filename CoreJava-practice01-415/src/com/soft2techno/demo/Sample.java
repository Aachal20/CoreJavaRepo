package com.soft2techno.demo;

public class Sample {

	public static void main(String[] args) {
		int a = 50;                                 //local variable
		System.out.println("a::" +a);   //50

		//a = 70;
		System.out.println("a::"+a);

		Sample s1 = new Sample();
		System.out.println("s1 value::"+s1);      //  s1 value::com.soft2techno.demo.Sample@41a4555e

		s1 = new Sample();                                  //s1 value::com.soft2techno.demo.Sample@3830f1c0
		System.out.println("s1 value::"+s1);  
	}

}
