package com.s2techno.inter.atmcard;

public class BOI implements ATMMachine {

@Override
public void withdraw(long l) {
	System.out.println("wirhdraw amount by using BOI Bank card"+l);
	
}
}
