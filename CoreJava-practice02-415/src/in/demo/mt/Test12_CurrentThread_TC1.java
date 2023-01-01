package in.demo.mt;

import java.lang.Thread.State;

class Example1{
	void m1() {
		Thread th = Thread.currentThread();
		String name = th.getName();
		int pp = th.getPriority();
		State  state = th.getState();
		
		System.out.println("m1 is executed in "+name+" thread");
		System.out.println("m1 is executed in "+pp+" with this priority");
		System.out.println("state "+state);
	}
}

class MyThread16 extends Thread{
	public void run() {
		System.out.println("\nRun start");
		Example1 e1 = new Example1();
		e1.m1();
		System.out.println("Run End");
	}
}

public class Test12_CurrentThread_TC1 {

	public static void main(String[] args) {
		System.out.println("Main Start");
		Example1 e1 = new Example1();
		e1.m1();
		MyThread16 mt = new MyThread16();
		//State state1 = mt.getState();
		//System.out.println("state::::" +state1);
		mt.start();
		System.out.println("Main End");
	}
}