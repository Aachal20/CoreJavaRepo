package in.demo.proj.bank;

public class InValidAmountException extends Exception {
	public InValidAmountException() {
		super();
	}

	public InValidAmountException(String msg) {
		super(msg);
	}
}
