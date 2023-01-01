package in.demo.proj.bank;

public interface IBank {
	public void deposit(double amt)throws InValidAmountException;
	public void withDraw(double amt)throws InSufficientFundException;
	public void checkbalance();
}
