package com.soft2techno.staticmethod;

public class LocalPreferences {

	static int a = 10; 
	static int b = 20;
    
	public static void main(String[] args) {
		
		System.out.println("a: " +a);   //10

		int a = 50;
		int b = 100;
		System.out.println("a: " +LocalPreferences.a);   //50
		System.out.println("b:" +b);  //20
		System.out.println("b: " +LocalPreferences.b);
	}

}
