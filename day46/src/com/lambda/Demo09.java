package com.lambda;

public class Demo09 {
	public static void main(String[] args) {
		new Thread(() -> {System.out.println("约吗");}).start();
	}
}
