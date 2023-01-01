package in.demo.eh.customexception;

import java.util.Scanner;

public class ManagerTest {
 public static void main(String[] args) {
	
	try {
		System.out.println("Enter deposit amount ");
		Scanner sc = new Scanner(System.in);
		double bal = sc.nextDouble();
		Bank bank = new HDFCBank();
		bank.deposit(bal);
		bank.balanceEnquiry();
	}
	catch(InValidAmountException inv) {
		System.out.println(inv.getMessage());
		System.out.println("plz pass valid amt of balance");
		
	}
	
	System.out.println("---------------------------------------------------------");
	try {
		System.out.println("Enter withdraw amount ");
		Scanner sc = new Scanner(System.in);
		double bal = sc.nextDouble();
		Bank bank = new HDFCBank();
	   double amt =	bank.withdraw(bal);
	System.out.println(amt);
		//bank.balanceEnquiry();
	}
	catch(InSuffiencentFundException inv) {
		System.out.println(inv.getMessage());
		System.out.println("plz pass valid numbr of balance");
	}
	
}
}
