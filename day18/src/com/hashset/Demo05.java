package com.hashset;

import java.util.HashSet;

public class Demo05 {
	public static void main(String[] args) {
		//创建对象
		HashSet<Pig> hs = new HashSet<Pig>();
		
		//添加元素
		hs.add(new Pig("tom", 18));
		hs.add(new Pig("jerry", 19));
		hs.add(new Pig("rose", 18));
		hs.add(new Pig("tom", 18));
		hs.add(new Pig("jack", 23));
		
		//遍历容器
		for (Pig pig : hs) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pig other = (Pig) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	/*@Override
	public int hashCode() {
		//return 1;
		return this.name.hashCode() + this.age * 23;
	}
	
	@Override
	public boolean equals(Object obj) {
		//return true;
		//return false;
		
		Pig p = (Pig)obj;
		return this.name.equals(p.name) && this.age == p.age;
	}*/
	
	
	
}