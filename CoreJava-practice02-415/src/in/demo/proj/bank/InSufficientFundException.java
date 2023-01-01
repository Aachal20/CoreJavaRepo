package in.demo.proj.bank;

public class InSufficientFundException extends Exception {
	public InSufficientFundException() {
		super();
	}

	public InSufficientFundException(String msg) {
		super(msg);
	}
}
