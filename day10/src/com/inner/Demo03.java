package com.inner;

import com.inner.Outer2.Inner2;

public class Demo03 {
	public static void main(String[] args) {
		/*Outer2.Inner2 oi = new Outer2.Inner2();
		System.out.println(oi.i);
		oi.print();*/
		
		Inner2 inner = new Inner2();
		System.out.println(inner.i);
		inner.print();
	}
}

class Outer2 {
	static class Inner2 {
		int i = 2;
		public void print() {
			System.out.println("在吗");
		}
	}
}