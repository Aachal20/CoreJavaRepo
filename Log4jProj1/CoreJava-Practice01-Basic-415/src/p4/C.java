package p4;

import p3.A;

public final  class C  extends A{

	public static void main(String[] args) {

		A a1 = new A();
		C c1 = new C();
		// System.out.println("a value :: " +a1.a); //no
		// System.out.println("b value :: " +a1.b); //no
		//  System.out.println("c value :: " +a1.c);  //c has a protected access in p1.A
		System.out.println("c value :: " +c1.c);
		//System.out.println("c value :: " +a1.d);
		System.out.println("d value :: " +c1.d);



	}

}
