package in.demo.eh;
//variable only intialzed in try block
public class Test31_VarIntiInTryCatch {

	public static void main(String[] args) {
		m1();
	}

	static void m1() {
		int a = 0;
		try {
			a = 10;
		}
		catch(ArithmeticException e) {

			System.out.println(a);
		}
		System.out.println(a);
	}

}
