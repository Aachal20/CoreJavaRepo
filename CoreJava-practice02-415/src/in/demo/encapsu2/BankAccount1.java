package in.demo.encapsu2;

public class BankAccount1 {
	private double balance;

	public void setBalance(double balance) {
		if(balance<=0) {
			System.out.println("Balance should be only +ve number");
		}
		else {
			this.balance = balance;
		}
	}

	public double getBalance() {
		return balance;
	}



}
