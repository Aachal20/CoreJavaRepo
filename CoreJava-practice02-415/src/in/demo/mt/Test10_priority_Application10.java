package in.demo.mt;

class MyThread13 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(getName()+" run: "+i);
		}
	}
}

public class Test10_priority_Application10 {

	public static void main(String[] args) {
		
		MyThread13 mt1 = new MyThread13();
		MyThread13 mt2 = new MyThread13();
		
		System.out.println("priority of m1::" +mt1.getPriority());  //5
		System.out.println("priority of m2::"+mt2.getPriority());  //5
		
		System.out.println("--------------------------------");
		mt1.setPriority(7);
		mt2.setPriority(9);
		
		System.out.println("priority of m1::"+mt1.getPriority());//7
		System.out.println("priority of m2::"+mt2.getPriority());//9
		System.out.println("--------------------------------");
		mt1.start();
		mt2.start();
	}
}