package in.demo.eh.customexception;

public class InValidAmountException extends Exception {
	
	public InValidAmountException() {
		
	}

	public   InValidAmountException(String msg) {
		super(msg);
	}
}
