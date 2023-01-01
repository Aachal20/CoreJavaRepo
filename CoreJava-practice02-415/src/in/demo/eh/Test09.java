package in.demo.eh;
//No exception is raised in a program
//exception is raised at state 1
//exception raised at stst 3 and catch block is matched
//excep raise at stste 3 and catch block is not matched
public class Test09 {

	void m1() {
		System.out.println(10/0);
		System.out.println("1");

		try {
			System.out.println("2");
			System.out.println("3");
			System.out.println("4");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("5");
			System.out.println("6");
			System.out.println("7");
		}
		System.out.println("8");

	}

}
