package in.demo.mt;

public class Test13_CurrentThread_TC2{
	
	static {
		System.out.println("SB is running "+Thread.currentThread().getName()+" thread");
	}

	public static void main(String[] args) {
		
		Thread th = Thread.currentThread();
		
		System.out.println("\nMain Thread Details");
		System.out.println(" Name: "+th.getName());
		System.out.println(" Priority: "+th.getPriority());
		
		th.setName("MyChild Main Thread");
		th.setPriority(9);
		
		System.out.println("\n Changed Name: "+th.getName());
		System.out.println(" Changed Priority: "+th.getPriority());
	}
}