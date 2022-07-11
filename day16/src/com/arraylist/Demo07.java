package com.arraylist;

import java.util.ArrayList;

public class Demo07 {
	public static void main(String[] args) {
		//创建容器
		ArrayList al = new ArrayList();
		
		//添加元素
		/*Pig p1 = new Pig("tom",18);
		Pig p2 = new Pig("jerry",19);
		Pig p3 = new Pig("rose",32);
		
		al.add(p1);
		al.add(p2);
		al.add(p3);*/
		
		al.add(new Pig("tom", 18));
		al.add(new Pig("jack", 23));
		al.add(new Pig("tony", 26));
		
		//遍历容器
		for(Object obj : al) {
			//System.out.println(obj);
			Pig pig = (Pig)obj;
			System.out.println(pig.getName() + "..." + pig.getAge());
		}
		
	}
}

class Pig {
	private String name;
	private int age;
	
	public Pig() {
		
	}

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
