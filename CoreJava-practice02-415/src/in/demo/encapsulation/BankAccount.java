package in.demo.encapsulation;

public class BankAccount {
 
	private double balance;

	public void setBalance(double balance) {
		if(balance<=0) {
			System.out.println("Balance should be +ve number ");
		}
		else {
			this.balance = balance;
		}
		
	}
	
	public double getBalance() {
		return balance;
	}

	
	
}
