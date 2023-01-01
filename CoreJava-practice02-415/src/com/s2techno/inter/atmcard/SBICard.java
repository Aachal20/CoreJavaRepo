package com.s2techno.inter.atmcard;

public class SBICard implements ATMMachine {

	@Override
	public void withdraw(long l) {
		  System.out.println(" This Much Amount is Withdraw  from SBI Bank Using SBI Bank Card::" +l);

	}

}
