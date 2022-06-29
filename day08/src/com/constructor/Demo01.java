package com.constructor;

public class Demo01 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.name);
	}
}

class Person {
	String name;
	public Person() {
		
	}
}