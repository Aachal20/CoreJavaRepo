package in.demo.eh;

public class Test06 {

	public static void main(String[] args) {
		
	try {
		System.out.println(10/0);
	}//try
	catch(ArithmeticException ae) {
			System.out.println("getMessage() method output ::");
			System.out.println(ae.getMessage());
			System.out.println("=======================================");
			
				  System.out.println("toString() method output ::");
				  System.out.println(ae.toString());
				  System.out.println("======================================");
				
				
				  System.out.println("printStackTrace() method output ::");
				  ae.printStackTrace();
				  System.out.println("======================================");
				 
		
		System.out.println("JVM default output ::");
		System.out.println("======================================");
		throw ae;          //by using this state we are just rethrowing the exception ,this exception
		                            //caught by JVM defalut handler and print full exception msg 
		                            //along with thread name
	}

	}

}
