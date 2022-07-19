package com.decorative;

public class Demo01 {
	public static void main(String[] args) {
		
	}
}

class A {
	public void print() {
		System.out.println("约吗");
	}
}

class A_Zi extends A {
	@Override
	public void print() {
		System.out.println("在吗");
		//System.out.println("约吗");
		super.print();
	}
}
