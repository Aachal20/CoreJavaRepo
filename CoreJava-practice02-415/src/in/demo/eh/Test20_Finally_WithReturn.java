package in.demo.eh;
//if we keep return statement in the finally block always the value return 
//from the finally block is transaferred to calling method
public class Test20_Finally_WithReturn {

	public static void main(String[] args) {
		int x = m1();
		System.out.println(x);
	}
	
	static int  m1() {
		try {
			System.out.println("In try");
			return 10;   //10
		}
		catch(ArithmeticException ae) {
			System.out.println("In catch");
			return 20;
		}
		finally {
			System.out.println("In finally");
			return 30;
		}

	}
}


