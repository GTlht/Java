package com.work;

import java.util.Scanner;

/*
7.根据需求写代码
(1)设计，并定义一个学员类：Student，要求有以下属性：
	学员编号（String） 
	姓名（String）
	性别（String）
	身高（double）
	年龄（int）
	使用封装的原则，并提供无参和全参的构造方法。
(2)定义MainApp类，并包含main()方法
(3)程序启动后，应分别提示用户输入学员编号、姓名等信息。
	例如控制台显示：
		请输入学员编号：
		...
		请输入学员姓名：
		...
(4)数据接收到程序中，并定义局部变量存储
(5)创建Student对象，通过构造方法将所有数据存储到Student对象中
(6)打印对象中的每个属性值

*/

public class Demo04 {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
	
		System.out.println("请输入学员编号：");
		String id = sc.next();
		System.out.println("请输入学员姓名：");
		String name = sc.next();
		System.out.println("请输入学员性别：");
		String sex = sc.next();
		System.out.println("请输入学员身高：");
		int height = sc.nextInt();
		System.out.println("请输入学员年龄：");
		int age = sc.nextInt();
		
		Student s = new Student(id, name, sex, height, age);
		s.show();*/
		
		
	}
}

/*class Student {
	private String id;
	private String name;
	private String sex;
	private int height;
	private int age;
	
	public Student() {}

	public Student(String id, String name, String sex, int height, int age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.height = height;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println(id + "..." + name + "..." + sex + "..." + height + "..." + age);
	}
}*/
