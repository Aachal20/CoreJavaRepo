package in.demo.eh.customexception;

public interface Bank {
 
	public void deposit(double amt) throws InValidAmountException;
	public double withdraw(double amt)throws InSuffiencentFundException;
	public void balanceEnquiry();
}
