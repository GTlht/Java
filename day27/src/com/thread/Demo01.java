package com.thread;

public class Demo01 {
	public static void main(String[] args) {
		//创建一个线程
		MyThread mt1 = new MyThread();
		mt1.start();
		
		//创建一个线程
		MyThread mt2 = new MyThread();
		mt2.start();
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
}
