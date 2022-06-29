package com.encapsulation;

public class Demo02 {
	public static void main(String[] args) {
		A a = new A();
		a.aaa();
		a.bbb();
		a.ccc();
	}
}

class A {
	int i = 1;
	
	public void aaa() {
		int i = 2;
		System.out.println(this.i);
	}
	
	public void bbb() {
		System.out.println(i);
	}
	
	public void ccc() {
		this.ddd();
	}
	
	public void ddd() {
		
	}
}
