package com.lambda;

public class Demo14 {
	public static void main(String[] args) {
		print(() -> {System.out.println("约吗");});
	}
	
	public static void print(E e) {
		e.show();
	}
}

interface E {
	public void show();
}