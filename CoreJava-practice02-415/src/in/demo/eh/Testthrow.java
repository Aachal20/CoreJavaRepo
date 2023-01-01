package in.demo.eh;

public class Testthrow {

	public static void main(String[] args) {
	  m1();
	 //m2();

	}
	//throw Kw points
	//throw must be used only inside method logic
	//throw must follow throwable type of object
	//throw statement is transfer statement so we can not place statement after throw statement
	                                   //it lead an error Unreachable statement
	
	static void m1() {
			throw new ArithmeticException();            //Runtime Exception(Unchecked Exception)
		
	}

	
	
	//throws points
		//throws must be used in method prototype after method parenthesis
		//throws kw  must follow throwable type of class name
		
	static void m2() throws InterruptedException {
	     throw new InterruptedException();
		}
	
	
	//Rule: Note-we are not allowed to write catch block with checked exception without throwing it from the try block 
	//it leads exception never thrown from the corresponding try statement
	
//case1
	void m3() throws InterruptedException {
		try {
		throw new	InterruptedException();       //checked exception
			//throw new	ArithmeticException();
		} 
		finally {
			
		}
	}
	
	//case2
	void m4() {
		try {
		throw new InterruptedException();
		}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
	}
		
	//case3
	void m5() throws InterruptedException{
		try {
			throw new	InterruptedException(); 
		}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
	}
		
	
	//case4
	void m6() throws InterruptedException{
			throw new	InterruptedException(); 
		
	}

}
