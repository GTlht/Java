package com.genericity;

public class Demo04 {
	public static void main(String[] args) {
		Inter inter = new InterImpl();
	}
}

interface Inter<E> {
	public void print(E e);
}

class InterImpl implements Inter<Integer> {
	public void print(Integer e) {
		System.out.println(e);
	}
}

/*interface Inter<E> {
	public void print(E e);
}

class InterImpl<Integer> implements Inter<Integer> {
	public void print(Integer e) {
		System.out.println(e);
	}
}*/

/*interface Inter<E> {
	public void print(E e);
}

class InterImpl<T> implements Inter<T> {
	public void print(T e) {
		System.out.println(e);
	}
}*/

/*interface Inter<E> {
	public void print(E e);
}

class InterImpl<E> implements Inter<E> {
	public void print(E e) {
		System.out.println(e);
	}
}*/

/*class Fu<E> {
	
}

class Zi<E> extends Fu<E> {
	
}*/

