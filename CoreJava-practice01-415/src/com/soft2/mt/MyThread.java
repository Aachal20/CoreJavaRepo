package com.soft2.mt;

public class MyThread extends Thread {
	 
	@Override
	public void run() {
		  System.out.println("run");
		}

	public static void main(String[] args) {
		  System.out.println("main");
		MyThread mt = new MyThread();
		mt.start();
	

	}

}
