package in.demo.mt;

//Develop a multithreaded program to execute two task concurrently
	//Task 1 --> display - 1 to 20 numbers
	//Task 2 --> display - 1 to 20numbers

class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.println("Run : "+i);
		}
	}//run
}//MyThread1

public class Test05_Assignement {

	public static void main(String[] args) {
		
		MyThread1 mt1 = new MyThread1();
		mt1.start();
		
		for(int i=1; i<=20; i++) {
			System.out.println("Main : "+i);
		}
	}//main
}//class