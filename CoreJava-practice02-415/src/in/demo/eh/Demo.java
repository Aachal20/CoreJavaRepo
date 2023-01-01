package in.demo.eh;

public class Demo {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b =  Integer.parseInt(args[1]);
		

			int c = a/b;
			System.out.println("Value of c is[Result] :: " +c);
			}
			catch(ArrayIndexOutOfBoundsException aiobe) {
				System.out.println("Please pass at least two Integer values");
			}
			catch(ArithmeticException  ae) {
				System.out.println("Please do not pass second value a 0");
			}
			catch(NumberFormatException  ae) {
				System.out.println("Please pass only Intgers value");
			}
		}
}

