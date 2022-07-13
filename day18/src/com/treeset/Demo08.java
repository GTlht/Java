package com.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo08 {
	public static void main(String[] args) {
		TreeSet<Pig> ts = new TreeSet<Pig>(new Comparator<Pig>() {
			@Override
			public int compare(Pig p1, Pig p2) {
				//比较姓名，大到小
				int num1 = p2.getName().compareTo(p1.getName());
				
				//比较年龄，小到大
				int num2 = num1 == 0 ? p1.getAge() - p2.getAge() : num1;
				
				return num2;
			}
		});
		
		ts.add(new Pig("tom", 18));
		ts.add(new Pig("jerry", 19));
		ts.add(new Pig("rose", 17));
		ts.add(new Pig("rose", 19));
		ts.add(new Pig("tom", 18));
		ts.add(new Pig("jack", 23));
		ts.add(new Pig("mary", 18));
		
		for (Pig pig : ts) {
			System.out.println(pig);
		}
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