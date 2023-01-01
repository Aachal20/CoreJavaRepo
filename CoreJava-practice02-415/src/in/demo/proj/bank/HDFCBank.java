package in.demo.proj.bank;

public class HDFCBank  implements IBank {

	private double balance;

	@Override
	public void deposit(double amt) throws InValidAmountException {
		if(amt<0) {
			throw new InValidAmountException();
		}
		else {
			System.out.println("This much amount is deposited to Your HDFC Bank Account:::" +amt);
		}
		System.out.println("---------------------------------------");
		balance = balance+amt;
		System.out.println("Your Balance " +balance);
	}

	@Override
	public void withDraw(double amt) throws InSufficientFundException {
		if(amt<0) {
			throw new  InSufficientFundException();
		}
		else {
			System.out.println("This much amount is withdraw from Your HDFC Bank Account:::" +amt);
		}
		System.out.println("---------------------------------------");

	}
	@Override
	public void checkbalance() {
		System.out.println("Current Balance ::"+balance);

	}


}
