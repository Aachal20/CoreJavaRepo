package in.demo.eh.customexception;

public class HDFCBank implements Bank {

	private double balance;

	@Override
	public void deposit(double amt) throws InValidAmountException {
		if(amt<=0) {                                //-5000.00//false
			throw new InValidAmountException(amt +" Invalid amount");
		}
		else {
			System.out.println("This much amount is deposited to HDFC Bank::" +amt);
		}
		System.out.println("------------------------------");
		balance = balance+amt;
		System.out.println(balance);
	}

	@Override
	public double  withdraw(double amt) throws InSuffiencentFundException {
		if(amt<=0) {
			throw new InSuffiencentFundException ("Insuffienecent Funds");
		}
		else {
			System.out.println("This much amount is withdraw from your HDFC Bank account::" +amt);
		}
		System.out.println("------------------------------");
		balance = balance-amt;
		return amt;
	}
	@Override
	public void balanceEnquiry() {
		System.out.println("Current balance ::" +balance);

	}

}
