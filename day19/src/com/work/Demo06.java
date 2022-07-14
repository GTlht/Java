package com.work;

import java.util.ArrayList;
import java.util.List;

/*
6.创建学生对象(Student类),包含学生信息(姓名和年龄),创建对应get、set方法,有参构造和无参构造。
  1、向List集合添加学生信息。
  2、把List集合中学生姓李的同学打印到控制台：(格式为：姓名为：李四,年龄为：24)
*/

public class Demo06 {
	public static void main(String[] args) {
		List<Student1> list = new ArrayList<>();
		
		list.add(new Student1("李四", 18));
		list.add(new Student1("李狗蛋", 19));
		list.add(new Student1("张三", 20));
		list.add(new Student1("赵四", 18));
		list.add(new Student1("田七", 21));
		list.add(new Student1("李白", 22));
		
		for (Student1 s : list) {
			if(s.getName().startsWith("李")) {
				System.out.println("姓名为：" + s.getName() + ", 年龄为：" + s.getAge());
			}
		}
	}
}

class Student1 {
	private String name;
	private int age;
	
	public Student1() {}

	public Student1(String name, int age) {
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
		return "Student1 [name=" + name + ", age=" + age + "]";
	}
	
}
