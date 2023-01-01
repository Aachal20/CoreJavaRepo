package in.demo.mt;


public class Test15_toString {

	public static void main(String[] args) {
		Thread th1 = new Thread();
		System.out.println(th1);

			Thread th2 = new Thread("Child1");
		System.out.println(th2);

		Thread th3 = Thread.currentThread();
		System.out.println(th3);

		//th3.setPriority(7);

		//	Thread th4 = new Thread();
		//System.out.println(th4);

		//System.out.println(th1);
		//System.out.println(th2);
	}
}