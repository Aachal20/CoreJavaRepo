package in.demo.eh;
//In case of void return type /method  we can suprees the exception
//using return;
public class Test22_Finally_Example {


	public static void main(String[] args) {
		m1();
		System.out.println("AFter m1 calling");

	}
	static void  m1() {
		try {
			System.out.println("In try");
			System.out.println(10/0);
		}
		catch(NullPointerException ae) {
			System.out.println("In catch");

		}
		finally {
			System.out.println("In finally");
			return ;
		}

	}
}


