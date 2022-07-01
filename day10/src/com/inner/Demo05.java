package com.inner;

public class Demo05 {
	public static void main(String[] args) {
		Outer5 outer = new Outer5();
		outer.print();
	}
}

class Outer5 {
	public void print() {
		class Inner5 {
			int i = 3;
			public void show() {
				System.out.println("滚犊子");
			}
		}
		
		Inner5 inner = new Inner5();
		System.out.println(inner.i);
		inner.show();
	}
}
