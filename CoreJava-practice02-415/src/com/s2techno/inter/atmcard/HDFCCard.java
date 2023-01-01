package com.s2techno.inter.atmcard;

public class HDFCCard implements ATMMachine {

	@Override
	public void withdraw(long l) {
	  System.out.println("This Much Amount is Withdraw  from HDFC Bank using HDFC bank card::" +l);

	}

}
