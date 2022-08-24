package com.lambda;

public class Demo04 {
	public static void main(String[] args) {
		D d = i -> System.out.println(i);
		d.show(12);
	}
}

interface D {
	public void show(int i);
}