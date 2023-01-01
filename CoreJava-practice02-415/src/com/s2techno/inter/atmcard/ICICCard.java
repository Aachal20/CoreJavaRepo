package com.s2techno.inter.atmcard;

public class ICICCard implements ATMMachine {

	@Override
	public void withdraw(long l) {
		  System.out.println(" This Much Amount is Withdraw  from ICIC Bank using ICIC Bank card::" +l);

	}

}
