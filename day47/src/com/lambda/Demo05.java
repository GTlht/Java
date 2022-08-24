package com.lambda;

public class Demo05 {
	public static void main(String[] args) {
		E e = () -> "约吗";
		System.out.println(e.show());
	}
}

interface E {
	public String show();
}