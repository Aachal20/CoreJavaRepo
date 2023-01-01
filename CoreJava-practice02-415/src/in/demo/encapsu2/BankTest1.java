package in.demo.encapsu2;

import java.util.Scanner;

public class BankTest1 {

	public static void main(String[] args) {
		
		BankAccount1 acc = new BankAccount1();
		//Bank acc = new Bank();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount :: ");
		double amt = sc.nextDouble();
		acc.setBalance(amt);
		double balnce = acc.getBalance();
		System.out.println("Current Balance ::" +balnce);


	}

}
