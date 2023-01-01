package in.demo.eh;

public class Test04_DivisionWithUserMsgSingleCatchBlock {

	public static void main(String[] args) {
		try{
			int a = Integer.parseInt(args[0]);
			int b =  Integer.parseInt(args[1]);

			int c = a/b;
			System.out.println("Value of c is[Result] :: " +c);
		}
		catch(Exception  e) {
		   e.getMessage();
		}
		/*
		 * catch(ArithmeticException ae) {
		 * System.out.println("Please pass valid integers value"); }
		 */

	}

}
