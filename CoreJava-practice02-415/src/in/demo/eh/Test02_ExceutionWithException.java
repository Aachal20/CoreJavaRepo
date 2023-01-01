package in.demo.eh;

public class Test02_ExceutionWithException {

	public static void main(String[] args) {
		//80/0-------------------> Infinite  result/wrong result
	  int a = 80;
	  int b = 0;
	  System.out.println("Value of a is :: " +a);
	  System.out.println("Value of b is :: " +b);
	  
	  int c = a/b;
	  System.out.println("Value of c is :: " +c);

	}

}
