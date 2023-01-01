package in.demo.encapsulation;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Amount");
	  double amt  = scn.nextDouble();
	  
	  BankAccount acc = new BankAccount();
	  acc.setBalance(amt);
	  
	  double bal = acc.getBalance();
	  System.out.println("Current Balance ::" +bal);

	}

}
