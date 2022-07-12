package com.genericity;

public class Demo02 {
	public static void main(String[] args) {
		/*A<String> a = new A<String>();
		a.print("aaa");
		a.print("bbb");*/
		
		A a = new A();
		a.print("aaa");
		a.print(123);
	}
}

class A<E> {
	public void print(E e) {
		System.out.println(e);
	}
}