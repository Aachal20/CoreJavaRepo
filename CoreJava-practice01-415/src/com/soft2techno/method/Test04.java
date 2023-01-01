package com.soft2techno.method;

public class Test04 {
	
	private static void m1(int a) {
		if(a==10) {                                           
			System.out.println("in if");   
			return;                                 //because of return statement rest of the statement are not executing
		}
		System.out.println("after if");  
		System.out.println("hi");         
	}

	
	private static int  m2(int a) {
		System.out.println("Before  if");  
		if(a==10) {                                                               
			System.out.println("in if");                 
			return a+10;                         //observe carefully if true then only come inside the if block                                             
		}                                                 //beacuse of return kw...rest of state no execute
		System.out.println("after if");            
		System.out.println("hi");             
		return 50; 
	}

	public static void main(String[] args) {
		
		/*
		 * System.out.println("In main start"); System.out.println("m1 start"); m1(10);
		 * System.out.println("m1 end");
		 * 
		 * 
		 * System.out.println("m1 start"); m1(20); System.out.println("m1 end");
		 * System.out.println("==================here m1() execution completed");
		 */
		
		//System.out.println("m2 start");
		//m1(10);
		
		
		
		//int x = m1();
		//System.out.println(m1());
		//System.out.println("-------------------------------------------");

		//System.out.println("m2 start");
	//	m2(20);
		//System.out.println("m2 end");
		//System.out.println("==================here m2() execution completed");
		//System.out.println("---------------------------------------- ");
	//	int y=m2(30);
	//	System.out.println("Return value of m2() method:::" +y);         //retun value stored here                  
	//	System.out.println("In main end" );
	}

}
