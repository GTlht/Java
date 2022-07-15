package com.work;

import java.util.HashMap;
import java.util.Map;

/*
1.分析以下需求，并用代码实现：
	(1)定义一个学生类Student，包含属性：姓名(String name)、年龄(int age)
	(2)定义Map集合，用Student对象作为key，用字符串(此表示表示学生的住址)作为value
	(3)利用四种方式遍历Map集合中的内容，格式：key::value
*/
public class Demo01 {
	public static void main(String[] args) {
		/*//创建容器
		Map<Student, String> map = new HashMap<>();
		
		//添加元素
		map.put(new Student("tom", 18), "成都");
		map.put(new Student("jerry", 18), "眉山");
		map.put(new Student("rose", 17), "都江堰");*/
		
		//遍历
		/*Set<Student> set = map.keySet();
		for (Student key : set) {
			String value = map.get(key);
			System.out.println(key.getName() + "..." + key.getAge() + "..." + value);
		}*/
		
		/*Set<Student> set = map.keySet();
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			Student key = it.next();
			String value = map.get(key);
			System.out.println(key.getName() + "..." + key.getAge() + "..." + value);
		}*/
		
		/*Set<Entry<Student, String>> set = map.entrySet();
		for (Entry<Student, String> entry : set) {
			Student key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.getName() + "..." + key.getAge() + "..." + value);
		}*/
		
		/*Set<Entry<Student, String>> set = map.entrySet();
		Iterator<Entry<Student, String>> it = set.iterator();
		while(it.hasNext()) {
			Entry<Student, String> entry = it.next();
			Student key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.getName() + "..." + key.getAge() + "..." + value);
		}*/
	}
}

/*class Student {
	private String name;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
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
		return "Student [name=" + name + ", age=" + age + "]";
	}
}*/
