package com.exception;

public class Demo13 {
	public static void main(String[] args) {
		Pig p = new Pig();
		p.setName("tom");
		p.setAge(-18);
		System.out.println(p);
	}
}

class Pig {
	private String name;
	private int age;
	
	public Pig() {}

	public Pig(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0) {
			throw new RuntimeException("年龄不可以为负数");
		} else {
			this.age = age;
		}
	}

	@Override
	public String toString() {
		return "Pig [name=" + name + ", age=" + age + "]";
	}
	
}