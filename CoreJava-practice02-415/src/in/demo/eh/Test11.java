package in.demo.eh;

public class Test11 {
//In th second case ,Arithemetic eception is raised in try block so the control is sent back to catch block
	//in catch block also we have rasied exception ,since this exception is caught ,program termionated abnormally
	
	void m2() {
		System.out.println("1");      //1

		try {
			System.out.println("2");   //2
			System.out.println(10/0);
			System.out.println("3");
     	}
		catch(ArithmeticException  aee) {
			System.out.println("4");   //4
			System.out.println(10/0);  
			System.out.println("5");
		}
		System.out.println("6");

	}
	

}
