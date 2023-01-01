package in.demo.eh;
//exception is raised in inner try and either inner catch or outer catch is not matched
public class Test26_InnerFinally_WithException {
public static void main(String[] args) {
		m1();	
	}
	static  void   m1() {
		try {
			System.out.println("In outer  try");

			try {
				System.out.println("In inner try");
				System.out.println(10/0);
			}
			catch(NullPointerException ae) {
				System.out.println("In inner catch");
			}
			finally {
				System.out.println("In inner finally");

			}
			System.out.println("After inner try/catch/finally ");
		}
		catch(NullPointerException ae) {
			System.out.println("In outer catch");

		}
		finally {
			System.out.println("In outer finally");
		}
	}

}
