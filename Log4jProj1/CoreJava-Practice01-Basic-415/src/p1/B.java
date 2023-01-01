package p1;

public class B {
  public static void main(String[] args) {
	  A e1 = new A();
	
		//System.out.println("a :" +e1.a);     //a has private access
		System.out.println("b :" +e1.b); 
		System.out.println("c :" +e1.c);
		System.out.println("d :" +e1.d);
  }
}
