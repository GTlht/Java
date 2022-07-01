package com.code_block;

public class Demo01 {
	public static void main(String[] args) {
		A a = new A();
		
		A a1 = new A();
	}
}

class A {
	{
		System.out.println("约吗");
	}
	
	public A() {
		System.out.println("滚犊子");
	}
	
}
