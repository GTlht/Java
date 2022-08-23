package com.lambda;

public class Demo07 {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("约吗");
	}
}
