package com.s2techno.inter.atmcard;

public class ATMTest {

	public static void main(String[] args) {
		ATMMachine machine;
		//  HDFCCard card = new HDFCCard();
		// card.withdraw(5000);
		/*	machine = new HDFCCard();
			machine.withdraw(5000);
			System.out.println("=================");
			//ICIC Bank card
			machine = new ICICCard();
			machine.withdraw(5000);
			System.out.println("=================");
			//SBIBank card
			machine = new SBICard();
			machine.withdraw(10000);
			System.out.println("=================");*/
		
		machine=new BOI();
		machine.withdraw(15000);
		
	}

}
