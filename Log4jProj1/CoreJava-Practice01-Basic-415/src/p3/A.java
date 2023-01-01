package p3;

public class A {

	private int a = 10;          //private variable
	               int b =20;          //default variable
	protected int c = 30;    //protected vari
	public int d = 40;           //public variable

	public static void main(String[] args) {
		
		A a1 = new A();
	  System.out.println("a value :: " +a1.a);
      System.out.println("b value :: " +a1.b);
      System.out.println("c value :: " +a1.c);
      System.out.println("d value :: " +a1.d);
	}

}

//private-enclosing class/withine a class
//default - withine package
//protected - withine package and also in another pkg but only by using sub class obj ref
//public -anywere u can access