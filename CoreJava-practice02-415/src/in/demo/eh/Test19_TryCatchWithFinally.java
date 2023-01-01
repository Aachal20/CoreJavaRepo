package in.demo.eh;
//try/finally with exception
public class Test19_TryCatchWithFinally {


	public static void main(String[] args) {
		try {
			System.out.println("In try");
			System.out.println(10/0);
		}
		finally {
			System.out.println("In finally");
		}
		System.out.println("AFter  try/catch/finally");

	}

}