package com.lambda;

public class Demo12 {
	public static void main(String[] args) {
		C c = () -> {return "约吗";};
		System.out.println(c.show());
	}
}

interface C {
	public String show();
}