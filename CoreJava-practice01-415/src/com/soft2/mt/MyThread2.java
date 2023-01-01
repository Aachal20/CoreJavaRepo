package com.soft2.mt;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		for(int i=0;i<15;i++) {
			System.out.println("run ::" +i);
		}
	}

	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		mt.start();
		for(int i=0;i<10;i++) {
			System.out.println("main::" +i);
		}



	}

}
