package in.demo.eh;

public class Test08 {

	void m2() {
		System.out.println("1"); //1

		try {
			System.out.println("2"); //2
			int x = 10/0;
			System.out.println("3");  //
		}
		
		
		catch(ArrayIndexOutOfBoundsException  aee) {
			System.out.println("4");
		}
		System.out.println("5");

	}
	

}
