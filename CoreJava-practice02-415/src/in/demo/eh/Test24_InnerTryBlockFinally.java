package in.demo.eh;
//No exception is raised in inner or outer try block
public class Test24_InnerTryBlockFinally {
	public static void main(String[] args) {
		m1();
	}
	static void m1() {
		try {
			System.out.println("In outer try");    
			try {
				System.out.println("In Inner try");
			}
			catch(NullPointerException ae) {
				System.out.println("In Innner catch");
			}
			finally {
				System.out.println("In Inner finally");
			}
			System.out.println("After Innner try/catch/finally");
		}
		catch(NullPointerException ae) {
			System.out.println("In outer catch");
		}
		finally {
			System.out.println("In outer finally");
		}
		System.out.println("In outer try/catch/finally");
	}
}
