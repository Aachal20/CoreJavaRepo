package in.demo.mt;

class MyThread10 extends Thread{
	private int x;
	
	MyThread10(){
		 x = 5;
	}
	MyThread10(int x){
		this.x = x;
	}
	public void run() {
		for(int i = 1; i<=x; i++) {    //5<=5
			System.out.println("Run: "+i); //0 , 1 ,2 ,3 ,4
		}
	}
}

public class Test06_TC11_Application8 {

	public static void main(String[] args) {
		MyThread10 mt1 = new MyThread10();
		mt1.start();
		System.out.println("----------------------");
		MyThread10 mt2 = new MyThread10(10);
		mt2.start();
		System.out.println("----------------------");
		MyThread10 mt3 = new MyThread10(15);
		mt3.start();
		System.out.println("----------------------");
	}
}