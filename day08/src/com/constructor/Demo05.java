package com.constructor;

public class Demo05 {
	public static void main(String[] args) {
		//需求：有些孩子刚出生没有姓名没有年龄
		Child c1 = new Child();
		System.out.println(c1.getName() + "..." + c1.getAge());
		
		//需求：有些孩子刚出生有姓名，但是没有年龄
		Child c2 = new Child("李狗蛋");
		System.out.println(c2.getName() + "..." + c2.getAge());
		
		//需求：有些孩子刚出生有姓名也有年龄
		Child c3 = new Child("哪吒", 18);
		System.out.println(c3.getName() + "..." + c3.getAge());
		c3.setName("李狗蛋");
		System.out.println(c3.getName() + "..." + c3.getAge());
		
	}
}

class Child {
	private String name;
	private int age;
	
	public Child() {}
	
	public Child(String name) {
		this.name = name;
	}
	
	public Child(String name, int age) {
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
		this.age = age;
	}
	
	
}