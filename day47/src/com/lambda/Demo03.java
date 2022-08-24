package com.lambda;

public class Demo03 {
	public static void main(String[] args) {
		C c = () -> System.out.println("约吗");
		c.show();
	}
}

interface C {
	public void show();
}
