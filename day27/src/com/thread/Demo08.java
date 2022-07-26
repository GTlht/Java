package com.thread;

public class Demo08 {
	public static void main(String[] args) {
		MyThread4 mt = new MyThread4();
		mt.start();
	}
}

class MyThread4 extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}
}
