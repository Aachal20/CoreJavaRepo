package in.demo.eh;

public class Test12 {
//In the third case, we added try/catch also in catch block so program is terminated normally
	void m2() {
		System.out.println("1"); //1

		try {
			System.out.println("2"); //2
			System.out.println(10/0);
			System.out.println("3");
		}
		catch(Exception  aee) {
			System.out.println("4");  //4
			try {
				System.out.println(10/0);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("5");   //5
			}

			System.out.println("6");  //6
		}
		System.out.println("7");   //6

	}


}
