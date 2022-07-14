package com.treemap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo02 {
	public static void main(String[] args) {
		/*//创建容器
		TreeMap<String, Pig> tm = new TreeMap<>();
		
		//添加元素
		tm.put("9527", new Pig("tom", 18));
		tm.put("9528", new Pig("jerry", 19));
		tm.put("9529", new Pig("rose", 16));
		tm.put("9530", new Pig("jack", 17));
		
		//遍历容器
		Set<String> set = tm.keySet();
		for (String key : set) {
			Pig value = tm.get(key);
			System.out.println(key + "..." + value.getName() + "..." + value.getAge());
		}*/
		
		/*//创建容器
		TreeMap<Pig, String > tm = new TreeMap<>();
		
		//添加元素
		tm.put(new Pig("tom", 18),"9527");
		tm.put(new Pig("jerry", 19), "9528");
		tm.put(new Pig("tom", 18),"9531");
		tm.put(new Pig("rose", 16), "9529");
		tm.put(new Pig("jack", 17), "9530");
		
		//遍历容器
		Set<Pig> set = tm.keySet();
		for (Pig key : set) {
			String value = tm.get(key);
			System.out.println(key.getName() + "..." + key.getAge() + "..." + value);
		}*/
		
		//创建容器
		TreeMap<Pig, String > tm = new TreeMap<>(new Comparator<Pig>() {
			@Override
			public int compare(Pig p1, Pig p2) {
				int n1 = p1.getAge() - p2.getAge();
				int n2 = n1 == 0 ? p1.getName().compareTo(p2.getName()) : n1;
				return n2;
			}
		});
		
		//添加元素
		tm.put(new Pig("tom", 18),"9527");
		tm.put(new Pig("jerry", 19), "9528");
		tm.put(new Pig("tom", 18),"9531");
		tm.put(new Pig("rose", 16), "9529");
		tm.put(new Pig("jack", 17), "9530");
		
		//遍历容器
		Set<Pig> set = tm.keySet();
		for (Pig key : set) {
			String value = tm.get(key);
			System.out.println(key.getName() + "..." + key.getAge() + "..." + value);
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
		int n1 = this.age - p.age;
		int n2 = n1 == 0 ? this.name.compareTo(p.name) : n1;
		return n2;
	}
}*/
