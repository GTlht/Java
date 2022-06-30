package com._final;

public class Demo02 {
	public static void main(String[] args) {
		//A a = new A();
		A a = new A(3);
		System.out.println(a.i);
	}
}

class A {
	//final int i = 3;
	final int i;
	
	/*public A() {
		i = 3;
	}*/
	
	public A(int i) {
		this.i = i;
	}
}
