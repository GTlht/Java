package com.genericity;

public class Demo03 {
	public static void main(String[] args) {
		B b = new B();
		b.print("约吗");
		b.print(123);
	}
}

class B {
	public <E> void print(E e) {
		System.out.println(e);
	}
	
	/*public void print(Object obj) {
		System.out.println(obj);
	}*/
}
