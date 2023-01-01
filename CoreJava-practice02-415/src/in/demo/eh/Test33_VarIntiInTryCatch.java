package in.demo.eh;

public class Test33_VarIntiInTryCatch {
//variable is intialized only in try and only catch block
	public static void main(String[] args) {
	m1();

	}

	 static void m1() {
	int a = 0;
	try {
		a = 10;
	}
	catch(ArithmeticException e) {
		a=20;
	  System.out.println(a);
	}
	catch(NullPointerException  e) {
	System.out.println(a);
	}
	System.out.println(a);
	}

}
