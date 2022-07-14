package com.work;

import java.util.ArrayList;
import java.util.Iterator;

/*
3.一个学科中有若干班级，每一个班级又有若干学生。
  请使用集合嵌套之ArrayList嵌套ArrayList描述这种关系，要求如下：
	1、学生类有两个属性，姓名和年龄，并定义有参构造、无参构造、setter和getter方法
	2、向班级集合中添加若干学生（至少两个学生）。
	3、向学科集合中添加所有班级（至少两个班级）。
	4、使用两种方式遍历学科集合并打印出所有学生。
*/

public class Demo03 {
	public static void main(String[] args) {
		//创建学科
		ArrayList<ArrayList<Student>> java = new ArrayList<>();
		
		//创建班级
		ArrayList<Student> java92 = new ArrayList<>();
		ArrayList<Student> java93 = new ArrayList<>();
		
		//创建学生
		Student s1 = new Student("tom", 18);
		Student s2 = new Student("jerry", 19);
		Student s3 = new Student("张三", 18);
		Student s4 = new Student("李四", 19);
		
		//存储数据
		java92.add(s1);
		java92.add(s2);
		
		java93.add(s3);
		java93.add(s4);
		
		java.add(java92);
		java.add(java93);
		
		//遍历：增强for
		/*for (ArrayList<Student> al : java) {
			for (Student s : al) {
				System.out.println(s.getName() + "..." + s.getAge());
			}
			System.out.println("------------------------");
		}*/
		
		//遍历：迭代器
		Iterator<ArrayList<Student>> it = java.iterator();
		while(it.hasNext()) {
			ArrayList<Student> al = it.next();
			Iterator<Student> it1 = al.iterator();
			while(it1.hasNext()) {
				Student s = it1.next();
				System.out.println(s.getName() + "..." + s.getAge());
			}
			System.out.println("------------------------------");
		}
		
		
	}
}

class Student {
	private String name;
	private int age;
	
	public Student() {}

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
	
	
}
