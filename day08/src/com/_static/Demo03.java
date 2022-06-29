package com._static;

public class Demo03 {
	public static void main(String[] args) {
		B b = new B();
		b.print();
	}
}

class B {
	static int i = 1;
	
	public static void show() {
		System.out.println("约吗");
	}
	
	public static void print() {
		System.out.println(i);
		show();
	}
}
