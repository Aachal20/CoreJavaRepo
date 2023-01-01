package in.demo.encapsu2;

public class BankUser {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setBalance(5000);
		
		double balance = bank.getBalance();
		System.out.println(balance);
  
	}

}
