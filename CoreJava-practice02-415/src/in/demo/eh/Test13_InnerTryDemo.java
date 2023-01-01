package in.demo.eh;

public class Test13_InnerTryDemo {

	
	public static void main(String[] args) {
		try {
			System.out.println("In Outer try");
			
		try {
				System.out.println("In Inner try");
				System.out.println(10/0);
			}//Itry
			catch(ArrayIndexOutOfBoundsException  ae) {
				System.out.println("In Inner catch");
			}//Icatch

			System.out.println("After Inner try catch");
		
		}//try
		
		catch(ArrayIndexOutOfBoundsException  aee) {
			System.out.println("In outer catch");
		}//catcch
		System.out.println("After outer try/catch");
	}

}
