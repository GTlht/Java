package com.inner;

public class Demo02 {
	public static void main(String[] args) {
		Outer1.Inner1 oi = new Outer1().new Inner1();
		System.out.println(oi.i);
		oi.print();
	}
}

class Outer1 {
	class Inner1 {
		int i = 1;
		
		public void print() {
			System.out.println("约吗");
		}
	}
}
