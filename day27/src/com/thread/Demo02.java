package com.thread;

public class Demo02 {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		
		//创建一个线程
		Thread t1 = new Thread(mr);
		//开启线程
		t1.start();
		
		//创建一个线程
		Thread t2 = new Thread(mr);
		//开启线程
		t2.start();
	}

}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
}
