package com.accessmodifier1;

public class Demo01 {
	public static void main(String[] args) {
		A a = new A();
		a.print();
	}
}

class A {
	private int i = 1;
	
	public void print() {
		System.out.println(i);
	}
}
