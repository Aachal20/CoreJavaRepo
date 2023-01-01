package com.soft2techno.demo;

public class ExampleDemo {
	//static variables
	static int a = 10;
	static int b = 20;
	static {
		System.out.println(" Static block is executed");
	}

	//NonStatic variable
	int x = 30;
	int y = 40;

	public static void main(String[] args) {
		//local  variable
		int p = 50;
		int q = 60;

		System.out.println("a:" +a);
		System.out.println("b:"+b);

		ExampleDemo demo = new ExampleDemo();
		System.out.println("x:" +demo.x);
		System.out.println("y:"+demo.y);

		System.out.println("p:" +p);
		System.out.println("q:"+q);
		//m1();	
	}
	static void m1() {
		int min = 55;
		int max = 100;
		System.out.println("min value :" +min);
		System.out.println("max value :"+max);
	}

}
