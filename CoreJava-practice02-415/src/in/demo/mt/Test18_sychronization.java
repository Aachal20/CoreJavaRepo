package in.demo.mt;

class Addition1{
	
	private static int x;
	private static int y;
	
//	public static  void add(int x,int y) {
	public static synchronized void add(int x,int y) {
		
		Addition1.x=x;//0  10
		Addition1.y=y;//0   20

		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	
		int z = Addition1.x + Addition1.y;
		System.out.println(Thread.currentThread().getName()+" addition result is: "+z);
	}
}


//=========================================================================================
class Thread3 extends Thread{
	
	public void run() {
		Addition1.add(70,80); //150
	}
}

class Thread4 extends Thread{
	
	public void run() {
		Addition1.add(50,20);  //70
	}
}

public class Test18_sychronization {

	public static void main(String[] args) {
		Thread3 th =	new Thread3();
		th.start();
		Thread4 th1 = new Thread4();
		th1.start();
	}
}