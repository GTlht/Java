package com._static;

public class Demo01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "桥本";
		p1.age = 28;
		p1.country = "日本";
		System.out.println(p1.name + "..." + p1.age + "..." + p1.country);
		
		Person p2 = new Person();
		p2.name = "小泽";
		p2.age = 30;
		//p2.country = "日本";
		System.out.println(p2.name + "..." + p2.age + "..." + p2.country);
		
		Person p3 = new Person();
		p3.name = "天海";
		p3.age = 24;
		//p3.country = "日本";
		System.out.println(p3.name + "..." + p3.age + "..." + p3.country);
	}
}

class Person {
	String name;
	int age;
	//String country = "日本";
	static String country;
}
