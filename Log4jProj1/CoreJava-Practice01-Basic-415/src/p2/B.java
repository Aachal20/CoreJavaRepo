package p2;

import p1.A;

public class B extends  A {
  public static void main(String[] args) {
	  A e1 = new A();
	  B b = new B();
	
		//System.out.println("a :" +e1.a);     //a has private access
		//System.out.println("b :" +e1.b);       //b has default access
		//System.out.println("c :" +e1.c);
	  System.out.println("c::" +b.c);
		System.out.println("d :" +e1.d);
  }
}
