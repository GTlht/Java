package com.treeset;

import java.util.TreeSet;

public class Demo04 {
	public static void main(String[] args) {
		/*TreeSet<Pig> ts = new TreeSet<Pig>();
		
		ts.add(new Pig("tom", 18));
		ts.add(new Pig("jerry", 19));
		ts.add(new Pig("rose", 17));
		ts.add(new Pig("tom", 18));
		ts.add(new Pig("jack", 23));
		ts.add(new Pig("mary", 18));
		
		for (Pig pig : ts) {
			System.out.println(pig);
		}*/
	}
}

/*class Pig implements Comparable<Pig> {
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

	@Override
	public int compareTo(Pig p) {
		//比较年龄，大到小
		int num1 = p.age - this.age;
		//比较姓名，小到大
		int num2 = num1 == 0 ? this.name.compareTo(p.name) : num1;
		
		return num2;
	}
}*/
