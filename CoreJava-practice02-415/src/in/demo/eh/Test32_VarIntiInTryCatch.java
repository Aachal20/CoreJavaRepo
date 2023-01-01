package in.demo.eh;
//variable intialized in both try and catch blocks
public class Test32_VarIntiInTryCatch {

	public static void main(String[] args) {
	m1();

	}

	 static void m1() {
	int a;
	try {
		a = 10;
	}
	catch(ArithmeticException e) {
		a=20;
	  System.out.println(a);
	}
	System.out.println(a);
	}

}
