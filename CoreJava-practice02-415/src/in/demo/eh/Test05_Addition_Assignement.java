package in.demo.eh;

public class Test05_Addition_Assignement {

	public static void main(String[] args) {
		
		try{
			int a = Integer.parseInt(args[0]);
			int b =  Integer.parseInt(args[1]);
			int c = a/b;
			
			System.out.println("Value of c is[Result] :: " +(a+b));
		}
		catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Result ::" +(4+5));
		}
		catch(ArithmeticException   ae) {
			System.out.println("Result ::" +(6+7));
		}
		catch(NumberFormatException nfe) {
			System.out.println("Result ::" +(8+9));
		}

	}
}
