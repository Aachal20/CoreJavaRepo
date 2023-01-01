package p4;

import p3.A;

public class D extends A{

	public static void main(String[] args) {
		A a1 = new A();
		//C c1 = new C();
		// System.out.println("a value :: " +a1.a); //no
		// System.out.println("b value :: " +a1.b); //no

		D d1 = new D();

		System.out.println("c value :: " +d1.c);  //c has a protected access in p1.A
		System.out.println("d value :: " +a1.d);


	}

}
