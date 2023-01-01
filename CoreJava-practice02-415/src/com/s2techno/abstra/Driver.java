package com.s2techno.abstra;

public class Driver {

	public static void main(String[] args) {
	   Bus b ;
	   b = new RedBus();
	   b.breaks();
	   b.engine();
	   System.out.println("--------------------");
	   b= new VolvoBus();
	   b.breaks();
	   b.engine();

	}

}
