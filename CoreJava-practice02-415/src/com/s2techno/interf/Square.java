package com.s2techno.interf;

public class Square implements Shape {

	int l;

	@Override
	public void findArea() {
	System.out.println("Square Area::" +(l*l));

	}

}


//Assignemnet
//Create a common interfce as a SIM by taking two common methods a public void call()  and public void sms()
//And create three implemented class Airtel , Jio  and BSNL.......And impl logic according to sub class
