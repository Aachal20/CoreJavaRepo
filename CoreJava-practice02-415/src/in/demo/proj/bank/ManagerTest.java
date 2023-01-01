package in.demo.proj.bank;

import java.util.Scanner;

public class ManagerTest {

	public static void main(String[] args) {
	try {
		System.out.println("Enter Deposit Amount ::");
		Scanner scn = new Scanner(System.in);
		double bal = scn.nextDouble();
		IBank bank = new HDFCBank();
		bank.deposit(bal);
		bank.checkbalance();
	}
	catch(InValidAmountException inv) {
        System.out.println(inv.getMessage());
        System.out.println("Please pass some valid amount number");
	}

	try {
		System.out.println("Enter Withdraw Amount ::");
		Scanner scn = new Scanner(System.in);
		double bal = scn.nextDouble();
		IBank bank = new HDFCBank();
		bank.withDraw(bal);
	
	}
	catch(InSufficientFundException  inv) {
        System.out.println(inv.getMessage());
        System.out.println("Please pass some valid  withdrawal amount number");
	}

}
}
