package com.treeset;

import java.util.TreeSet;

public class Demo01 {
	public static void main(String[] args) {
		/*TreeSet<Pig> ts = new TreeSet<Pig>();
		
		ts.add(new Pig("tom", 18));
		ts.add(new Pig("jerry", 19));
		ts.add(new Pig("rose", 17));
		ts.add(new Pig("tom", 18));
		ts.add(new Pig("jack", 23));
		
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
		//return 0;
		//return 1;
		return -1;
	}
}*/
