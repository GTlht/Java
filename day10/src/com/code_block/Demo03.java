package com.code_block;

public class Demo03 {
	public static void main(String[] args) {
		B b1 = new B();
		
		B b2 = new B();
	}
}

class B {
	static {
		System.out.println("约吗");
	}
	
	public B() {
		System.out.println("滚犊子");
	}
}
