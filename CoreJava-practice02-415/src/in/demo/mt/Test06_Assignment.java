package in.demo.mt;

//Develop a multithreaded program to execute two task concurrently
	//Task 1 --> display - 1 to 20 numbers
	//Task 2 --> display - 20 to 1 numbers

class MyThread5 extends Thread{
	@Override
	public void run() {
		for(int i=20; i>=1; i--) {
			System.out.println("Run : "+i);
		}
	}//run
}//MyThread1

public class Test06_Assignment {

	public static void main(String[] args) {
		
		MyThread5 mt1 = new MyThread5();
		mt1.start();
		
		for(int i=1; i<=20; i++) {
			System.out.println("Main : "+i);
		}
	}//main
}//class