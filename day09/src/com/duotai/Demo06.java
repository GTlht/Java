package com.duotai;

public class Demo06 {
	public static void main(String[] args) {
		A a = new B();
		//a.print();
		/*B b = (B)a;
		b.print();*/
		C c = (C)a;
		c.print();
		
		Animal an = new Dog();
		//Dog dog = (Dog)an;
		Pig pig = (Pig)an;
	}
}

class A {
	
}

class C extends A {
	public void print() {
		
	}
}

class B extends A {
	public void print() {
		System.out.println("b...");
	}
}
