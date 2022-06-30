package com._final;

public class Demo03 {
	public static void main(String[] args) {
		B b = new B();
		/*System.out.println(b.p.name);
		System.out.println(b.p.age);*/
		Person p = b.p;
		System.out.println(p.name + "..." + p.age);
		p.name = "tom";
		p.age = 18;
		System.out.println(p.name + "..." + p.age);
		p.name = "jerry";
		p.age = 19;
		System.out.println(p.name + "..." + p.age);
		
		//b.p = new Person();//b.p = 0x002
		
	}
}

class B {
	final Person p = new Person();//p=0x001
	final int i = 3;
}

class Person {
	String name;
	int age;
}
