package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo05 {
	public static void main(String[] args) {
		//创建容器
		ArrayList<Person> al = new ArrayList<>();
		
		//添加元素
		al.add(new Person("tom", 18));
		al.add(new Person("jerry", 18));
		al.add(new Person("tom", 18));
		al.add(new Person("rose", 19));
		al.add(new Person("jack", 20));
		
		System.out.println(al);
		
		//public static <T> void sort(List<T> list, Comparator<? super T> c)
		//Collections.sort(al);
		Collections.sort(al, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				int n1 = p1.getAge() - p2.getAge();
				int n2 = n1 == 0 ? p1.getName().compareTo(p2.getName()) : n1;
				return n2;
			}
		});
		
		System.out.println(al);
		
	}
}

class Person {
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
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
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
