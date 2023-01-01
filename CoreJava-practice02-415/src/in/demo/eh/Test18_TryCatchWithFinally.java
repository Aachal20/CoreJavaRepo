package in.demo.eh;
////try/finally without  exception 
public class Test18_TryCatchWithFinally {

	public static void main(String[] args) {
		try {
			System.out.println("In try");
		}
		finally {
			System.out.println("In finally");
		}
		System.out.println("AFter  try/catch/finally");

	}

}