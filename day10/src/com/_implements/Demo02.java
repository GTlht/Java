package com._implements;

public class Demo02 {
	public static void main(String[] args) {
		System.out.println(A.i);
	}
}

interface A {
	//int i = 1;
	//final int i = 1;
	//static final int i = 1;
	public static final int i = 1;
	
	public void eat();
	public void drink();
}

class AImpl implements A {
	public void eat() {
		
	}
	
	public void drink() {
		
	}
}