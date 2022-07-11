package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo02 {
	public static void main(String[] args) {
		//创建集合容器
		Collection c = new ArrayList();
		
		System.out.println(c);
		
		//添加元素
		c.add("aaa");
		c.add(new Pig("tom", 18));
		c.add(123);
		c.add(true);
		c.add('约');
		
		System.out.println(c);
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
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pig [name=" + name + ", age=" + age + "]";
	}
	
	
}
