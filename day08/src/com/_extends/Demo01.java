package com._extends;

public class Demo01 {
	public static void main(String[] args) {
		B b = new B();
		b.show();
		b.print();
	}
}

class A {
	public void show() {
		System.out.println("约吗");
	}
	
	public void print() {
		System.out.println("滚犊子");
	}
}

class B extends A {
	
}
