package com._static;

public class Demo02 {
	public static void main(String[] args) {
		System.out.println(A.i);
		A.aaa();
		
		A a = new A();
		a.bbb();
	}
}

class A {
	static int i;
	
	public static void aaa() {
		System.out.println("约吗");
		//System.out.println(this);
	}
	
	public void bbb() {
		System.out.println(this);
	}
}
