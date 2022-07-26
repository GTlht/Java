package com.thread;

public class Demo06 {
	public static void main(String[] args) {
		//创建一个线程
		MyThread2 mt1 = new MyThread2();
		mt1.setName("tom");
		mt1.setPriority(10);
		//System.out.println(mt1.getPriority());
		mt1.start();
		
		//创建一个线程
		MyThread2 mt2 = new MyThread2();
		mt2.setName("jerry");
		mt1.setPriority(1);
		//System.out.println(mt2.getPriority());
		mt2.start();
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(getName() + "..." + i);
		}
	}
}
