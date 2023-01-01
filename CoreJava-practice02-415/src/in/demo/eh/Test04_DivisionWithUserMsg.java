package in.demo.eh;

public class Test04_DivisionWithUserMsg {

	public static void main(String[] args) {
		try{
			int a = Integer.parseInt(args[0]);
			int b =  Integer.parseInt(args[1]);

			int c = a/b;
			System.out.println("Value of c is[Result] :: " +c);
		}
		catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Please pass atleast two integers value");
		}
		catch(ArithmeticException   ae) {
			System.out.println("Please DONOT pass second value as zero");
		}
		catch(NumberFormatException nfe) {
			System.out.println("Please pass only Integers values");
		}

	}

}
