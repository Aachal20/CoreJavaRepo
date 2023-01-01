package in.demo.mt;

class MyThread55 extends Thread{
	@Override
	public void run() {
		System.out.println("Run Start");
		System.out.println("Run End");
	}
}

public class Test16_sleep {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main start");
		MyThread55 mt = new MyThread55();
		mt.start();
		
		Thread.sleep(10000);
		System.out.println("Main End");
	}
}
