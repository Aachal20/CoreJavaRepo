package com.s2techno.abstra;

   abstract class Bus {
	
	 abstract void engine();
	  void breaks() {
	   System.out.println("Bus has a two breaks");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
	}
}

