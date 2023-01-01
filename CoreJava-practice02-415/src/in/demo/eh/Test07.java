package in.demo.eh;

public class Test07 {

	
	void m1() {
		System.out.println("1");         //1

		try {
			System.out.println("2");       //2
			int x = 10/0;                              
			System.out.println("3");       //3
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("4");     //4
    	}
		catch(Exception e) {
			System.out.println("5");     //4
    	}
				
	
		System.out.println("6");     //6

	}

}
