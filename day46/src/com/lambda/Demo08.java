package com.lambda;

public class Demo08 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("约吗");
			}
		}).start();
	}
}
