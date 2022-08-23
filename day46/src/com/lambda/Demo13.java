package com.lambda;

public class Demo13 {
	public static void main(String[] args) {
		D d = (int i) -> {return i + "约吗";};
		System.out.println(d.show(12));
	}
}

interface D {
	public String show(int i);
}