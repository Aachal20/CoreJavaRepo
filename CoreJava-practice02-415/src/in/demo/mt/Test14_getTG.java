//public ThreadGroup getThreadGroup()

package in.demo.mt;

public class Test14_getTG {

	public static void main(String[] args) {
		
		Thread th1 = new Thread();
		System.out.println(th1.getThreadGroup()); //main  5 main
		System.out.println(th1.getThreadGroup().getName()); //main
		System.out.println("-------------------------");
		
		ThreadGroup tg1 = new ThreadGroup("Group A");
		Thread th2 = new Thread(tg1,"Child1");
		System.out.println(th2.getThreadGroup());
		System.out.println(th2.getThreadGroup().getName());
		System.out.println("------------------------");
		
	
	}
}