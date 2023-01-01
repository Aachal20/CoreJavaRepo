package com.soft2techno.demo;

public class Test01 {
  
	//static variable
	static int x = 10;
	static int y = 20;
	
	//NS Var
	int p = 30;
	int q = 40;
	
	public static void main(String[] args){
		
		//LV
		int m = 50;
		int n  = 60;
		System.out.println("x::" +x);
		System.out.println("x ::" +Test01.x);
		
		Test01 test = new Test01();
		System.out.println("y::" +test.y);
		
		System.out.println("main");

	}

}
