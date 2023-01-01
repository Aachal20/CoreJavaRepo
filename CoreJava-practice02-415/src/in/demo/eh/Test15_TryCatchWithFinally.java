package in.demo.eh;
//try/catch/finally without exception
public class Test15_TryCatchWithFinally {

	public static void main(String[] args) {
	try {
		System.out.println("In try");
	}
	catch(Exception e) {
		System.out.println("In catch");
	}
	finally {
		System.out.println("In finally");
	}
	System.out.println("In try/catch/finally");

	}

}
