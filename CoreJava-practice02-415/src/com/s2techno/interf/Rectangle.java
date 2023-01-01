package com.s2techno.interf;

public class Rectangle  implements Shape{

	int l=0;
	int b=0;
	
	@Override
	public void findArea() {
		System.out.println("Rectangle Are ::" +(l*b));
		
	}

}
