package com.s2techno.interf;

public class Circle implements Shape {

	double r;
	
	@Override
	public void findArea() {
		System.out.println("Circle Area ::" +(3.14*r*r));

	}

}
