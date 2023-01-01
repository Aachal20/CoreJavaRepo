package in.demo.eh;
//try/catch/finally with exception and catch block is not  matched
public class Test17_TryCatchWithFinally {

	public static void main(String[] args) {
	try {
		System.out.println("In try");
		System.out.println(10/0);
	}
	catch(NullPointerException  e) {
		System.out.println("In catch");
	}
	finally {
		System.out.println("In finally");
	}
	System.out.println("In try/catch/finally");

	}

}

