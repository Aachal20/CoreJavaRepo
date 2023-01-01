package in.demo.eh;

public class Test10 {
//In the first case,there is no exception in try block ,so catch block is not executed
	
	void m2() {
		System.out.println("1");   //1

		try {
			System.out.println("2");  //2
     	}
		catch(ArithmeticException  aee) {
			System.out.println("4");
			System.out.println(10/0);
			System.out.println("5");
		}
		System.out.println("6");  //6

	}
	

}
