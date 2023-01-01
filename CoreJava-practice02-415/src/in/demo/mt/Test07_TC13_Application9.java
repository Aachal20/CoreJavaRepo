package in.demo.mt;

class AddThread extends Thread  {
	@Override
	public void run() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {     //  1  to  10
			sum = sum + i;     //3+2
			System.out.println("Summation: "+i);      //0 ,1 ,3,5
		}
	}
}

class SubThread extends Thread{
	@Override
	public void run() {
		int diff = 0;
		for(int i = 1; i <= 10; i++) {
			diff = diff - i;
			System.out.println("Subtraction: "+i);      //1 to 10
		}
	}
}

public class Test07_TC13_Application9 {

	public static void main(String[] args) {
		AddThread adt = new AddThread();
		SubThread ast = new SubThread();
		
		adt.start();
		ast.start();
	}
}