package com.treeset;

import java.util.TreeSet;

public class Demo04 {
	public static void main(String[] args) {
		/*//创建容器
		TreeSet<Pig> ts = new TreeSet<Pig>();
		
		//添加元素
		ts.add(new Pig("tom", 18));
		ts.add(new Pig("jerry", 19));
		ts.add(new Pig("rose", 17));
		ts.add(new Pig("tom", 18));
	
		//遍历
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
	public int compareTo(Pig pig) {
		//return 0; 只有一个
		//return 1; 正序
		return -1; //倒叙
	}
}*/