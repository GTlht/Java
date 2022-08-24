package com.lambda;

public class Demo06 {
	public static void main(String[] args) {
		F f = i -> i + "约吗";
		System.out.println(f.show(12));
	}
}

interface F {
	public String show(int i);
}