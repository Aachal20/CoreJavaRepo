package in.demo.eh;

//if finally block has return statement the excep raised in try block will never propagated
//to calling method  ,becasue the return value override the exception object in JDH
public class Test21_Finally_Example {

	public static void main(String[] args) {

		// System.out.println(m1());
		 m1();            
		//System.out.println(x);        //calling method 
	}
	
	
	
	static void  m1() {                     //called method
		try { 
			System.out.println("In try");
			System.out.println(10/0);   //exception is override by JDH
		}
		catch(NullPointerException ae) {
			System.out.println("In catch");
		}
		finally {
			System.out.println("In finally");
			//return 30;
		}
	}
}


