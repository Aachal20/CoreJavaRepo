package in.demo.eh;

public class Test14_InnerTryDemo {

	
	public static void main(String[] args) {
		
		try {
			int a = Integer.parseInt(args[0]);
			System.out.println("a:" +a);
			
			try {
				int[]  x = new int[a];
				System.out.println("Arrary size::"  +x.length);
		    }
			catch(NegativeArraySizeException  ae) {
				int[] x = new int[3];
				System.out.println("Arrary size::"  +x.length);
			}
			int b = a+20;
			System.out.println("b::" +b);
		}
			
		catch(ArrayIndexOutOfBoundsException  ae) {
			System.out.println("pass one int value");
		}
		catch(NumberFormatException  nfe) {
			System.out.println("pass only int value");
		}
	
	}

}
