package com.work;

import java.util.ArrayList;

/*
2.分析以下需求，并用代码实现：
	(1)定义一个Person类型(属性私有、空参有参构造、set、get方法、toString方法)，
		包含三个属性：姓名(String name)、年龄(int age)
	(2)List集合中存储多个Person对象,获取年龄最大的Person对象并打印信息
	(3)思路
		a.定义一个Person类型的变量, 先记住第一个元素
		b.循环遍历集合
		c.用每一个元素和变量比较年龄, 如果集合中的元素比变量记住的年龄大
		d.用变量记住这个年龄较大的元素
		e.返回变量记住的元素
*/

public class Demo02 {
	public static void main(String[] args) {
		//创建容器
		ArrayList<Person> al = new ArrayList<Person>();
		
		//添加元素
		al.add(new Person("tom", 18));
		al.add(new Person("jerry", 19));
		al.add(new Person("rose", 16));
		al.add(new Person("jack", 23));
		
		//获取年龄最大的哥们信息
		Person max = al.get(0);
		
		for(int i = 1; i < al.size(); i++) {
			Person p = al.get(i);
			if(max.getAge() < p.getAge()) {
				max = p;
			}
		}
		
		System.out.println(max);
		
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
	
	
}
