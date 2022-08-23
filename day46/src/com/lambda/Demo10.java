package com.lambda;

public class Demo10 {
	public static void main(String[] args) {
		A a = () -> {System.out.println("约吗");};
		a.show();
	}
}

interface A {
	public void show();
}
