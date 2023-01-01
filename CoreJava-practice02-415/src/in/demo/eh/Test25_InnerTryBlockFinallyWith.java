package in.demo.eh;
//nooooo
//return statement is placed in inner finally
public class Test25_InnerTryBlockFinallyWith {

	public static void main(String[] args) {
		m1();
	}
	static int  m1(){
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
				return 10;
			}
			//System.out.println("After Innner try/catch/finally");
		}
		catch(NullPointerException ae) {
			System.out.println("In outer catch");
		}
		finally {
			System.out.println("In outer finally");
		}
		System.out.println("In outer try/catchfinally");
		return 30;
	}
}

