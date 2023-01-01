package in.demo.mt;

//Develop a multithreaded program to execute two task concurrently
	//Task 1 --> display - 1 to 20 numbers
	//Task 2 --> display - 20 to 1 numbers

class MyThread66 extends Thread{
	@Override
	public void run() {
		for(int i=20; i>=1; i--) {
			System.out.println("Run : "+i);
		}
	}//run
}//MyThread1

public class Test07_run {

	public static void main(String[] args) {
		
		MyThread66 mt1 = new MyThread66();
		//mt1.start();
		mt1.run();
		
		for(int i=1; i<=20; i++) {
			System.out.println("Main : "+i);
		}
	}//main
}//class