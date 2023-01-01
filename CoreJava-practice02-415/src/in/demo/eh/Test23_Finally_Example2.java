package in.demo.eh;
//Unreachebale statement : if we place return stement in finally block
//we cannot place statement after finally block it leads to CE:Unreachable statement
public class Test23_Finally_Example2 {

	public static void main(String[] args) {
		m1();
		System.out.println("AFter m1 calling");
	}
	static int   m1() {
		try {
			System.out.println("In try");
			return 10;
		}
		catch(NullPointerException ae) {
			System.out.println("In catch");
			return 10;
		}
		finally {
			System.out.println("In finally");
			return 30;
			//System.out.println("AFter try/catchfinally"); //CE
		}
		// System.out.println("AFter try/catchfinally"); //CE
	}
}


