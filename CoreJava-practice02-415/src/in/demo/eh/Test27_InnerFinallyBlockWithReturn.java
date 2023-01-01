package in.demo.eh;
//exception is raised in inner try and either inner catch or outer catch is not matched
//becasuse of return exception is suppresed
public class Test27_InnerFinallyBlockWithReturn {
public static void main(String[] args) {
		m1();	
	}
	static  int  m1() {
		try {
			System.out.println("In outer try");
			try {
				System.out.println("In Inner try");

			}
			catch(NullPointerException ae) {
				System.out.println("In Inner catch");

			}
			finally {
				System.out.println("In Inner finally");

			}
			System.out.println("After  Inner/try/catch/finally ");
		}
		catch(NullPointerException npe) {
			System.out.println("In outer catch");
		}
		finally {
			System.out.println("In outer finally");
		}
		System.out.println("After outer try/catch/finally");
		return 30;
	}
}

