package com.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo02 {
	public static void main(String[] args) {
		/*//创建容器
		HashMap<String, Person> hm = new HashMap<>();
		
		//添加元素
		hm.put("成都", new Person("tom", 18));
		hm.put("绵阳", new Person("jerry", 18));
		hm.put("宜宾", new Person("rose", 19));
		hm.put("南充", new Person("jack", 20));
		hm.put("阿坝", new Person("tony", 22));
		
		//遍历
		Set<String> set = hm.keySet();
		for (String key : set) {
			Person p = hm.get(key);
			System.out.println(key + "..." + p.getName() + "..." + p.getAge());
		}*/
		
		//创建容器
		HashMap<Person, String> hm = new HashMap<>();
		
		//添加元素
		hm.put(new Person("tom", 18), "成都");
		hm.put(new Person("jerry", 18), "绵阳");
		hm.put(new Person("rose", 18), "遂宁");
		hm.put(new Person("jack", 18), "巴中");
		hm.put(new Person("tony", 18), "达州");
		hm.put(new Person("tom", 18), "广安");
		
		//遍历容器
		Set<Entry<Person, String>> set = hm.entrySet();
		for (Entry<Person, String> entry : set) {
			Person key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.getName() + "..." + key.getAge() + "..." + value);
		}
	}
}

class Person {
	private String name;
	private int age;
	
	public Person() {}

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
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.age * 18;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age == p.age;
	}
	
}