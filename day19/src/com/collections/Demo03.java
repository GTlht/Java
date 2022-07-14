package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo03 {
	public static void main(String[] args) {
		//创建容器
		ArrayList<Pig> al = new ArrayList<>();
		
		//添加元素
		al.add(new Pig("tom", 18));
		al.add(new Pig("jerry", 19));
		al.add(new Pig("tom", 18));
		al.add(new Pig("rose", 18));
		al.add(new Pig("jack", 15));
		
		System.out.println(al);
		
		//public static <T extends Comparable<? super T>> void sort(List<T> list)
		Collections.sort(al);
		
		System.out.println(al);
	}
}

class Pig implements Comparable<Pig> {
	private String name;
	private int age;
	public Pig() {
		super();
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
	@Override
	public int compareTo(Pig p) {
		int n1 = p.age - this.age;
		int n2 = n1 == 0 ? p.name.compareTo(this.name) : n1;
		return n2;
	}
	
		
}
