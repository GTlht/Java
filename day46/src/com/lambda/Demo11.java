package com.lambda;

public class Demo11 {
	public static void main(String[] args) {
		B b = (int i) -> {System.out.println(i);};
		b.show(12);
	}
}

interface B {
	public void show(int i);
}