package p1;

public class A {
   
	private int a      = 10;   //private variable
	             int b      = 20;   // package level variable
	protected int c = 30;   //protected variable
	public int  d      = 40;    //public variable
	
	public static void main(String[] args) {
		//crete a object(Using class nname)
		A e1 = new A();
		System.out.println("a :" +e1.a);
		System.out.println("b :" +e1.b);
		System.out.println("c :" +e1.c);
		System.out.println("d :" +e1.d);
	}

}
