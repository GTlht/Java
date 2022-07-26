package com.thread;

public class Demo07 {
	public static void main(String[] args) {
		//创建一个线程
		MyThread3 mt1 = new MyThread3();
		mt1.setName("tom");
		mt1.setDaemon(true);
		mt1.start();
		
		//创建一个线程
		MyThread3 mt2 = new MyThread3();
		mt2.setName("jerry");
		mt2.setDaemon(true);
		mt2.start();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + "..." + i);
		}
	}
}

class MyThread3 extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(getName() + "..." + i);
		}
	}
}
