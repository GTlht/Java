package com.thread;

public class Demo05 {
	public static void main(String[] args) {
		//创建一个线程
		MyThread1 mt1 = new MyThread1();
		mt1.setName("线程A");
		mt1.start();
		
		//创建一个线程
		MyThread1 mt2 = new MyThread1();
		mt2.setName("线程B");
		mt2.start();
		
		Thread.currentThread().setName("线程C");
		for(int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "..." + i);
		}
	}
}

class MyThread1 extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(getName() + "..." + i);
		}
	}
}