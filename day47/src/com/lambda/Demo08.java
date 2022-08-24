package com.lambda;

public class Demo08 {
	public static void main(String[] args) {
		H h = print();
		h.show();
	}
	
	public static H print() {
		return () -> System.out.println("约吗");
	}
}

interface H {
	public void show();
}