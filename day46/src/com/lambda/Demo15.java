package com.lambda;

public class Demo15 {
	public static void main(String[] args) {
		F f = print();
		f.show();
	}
	
	public static F print() {
		return () -> {System.out.println("约吗");};
	}
}

interface F {
	public void show();
}