package com.encapsulation;

public class Demo01 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("tom");
		p.setAge(18);
		System.out.println(p.getName() + "..." + p.getAge());
	}
}

class Person {
	private String name;
	private int age;
	
	/*public void setName(String n) {
		this.name = n;
	}*/
	/*public void setName(String name) {
		name = name;
	}*/
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	/*public void setAge(int age) {
		age = age;
	}*/
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
}
