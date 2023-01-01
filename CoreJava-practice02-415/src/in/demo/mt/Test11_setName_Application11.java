package in.demo.mt;

class MyThread14 extends Thread{


	MyThread14(){
		super();
	}

	MyThread14(String name){
		super(name);
	}

	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(getName()+" run "+i);
		}
	}
}

public class Test11_setName_Application11 {

	public static void main(String[] args) {

		System.out.println("Main Start");

		MyThread14 mt1 = new MyThread14();
		MyThread14 mt2 = new MyThread14("Child2");

		System.out.println("mt1 name: "+mt1.getName());          //Thread-0
		System.out.println("mt1 priority: "+mt1.getPriority());  //5
		System.out.println("-----------------------------------");
		System.out.println("mt2 name: "+mt2.getName());   //Child2
		System.out.println("mt2 priority: "+mt2.getPriority()); //5
		System.out.println("-----------------------------------");

		mt1.setName("Child1");
		mt1.setPriority(6);
		System.out.println("\nmt1 name: "+mt1.getName());
		System.out.println("mt1 priority: "+mt1.getPriority());
		System.out.println("-----------------------------------------------------------------");	


			mt2.setPriority(9);


		System.out.println("mt2 name: "+mt2.getName()); //child2
		System.out.println("mt2 priority: "+mt2.getPriority());//9

		mt1.start();
		mt2.start();

		System.out.println("Main End");
	}
}