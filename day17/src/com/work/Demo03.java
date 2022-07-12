package com.work;

import java.util.ArrayList;
import java.util.Scanner;

/*
3.程序启动后可以接收三个学员信息，然后可以打印所有学员信息，并找出身高最高的学员，并打印他们的详细信息
	1.定义MainApp类，包含main()方法；
	2.在main()方法中，创建一个可以存储Student对象的集合对象；
	3.从控制台接收以下几个Student对象：
		学号	姓名	性别	年龄	身高	
		a001	黄渤	男		20		1.72		
		a002	孙红雷	男		22		1.78		
		a003	章子怡	女		18		1.64		
		将每个对象添加到集合中(集合中学员学号唯一)；
	4.在MainApp中创建方法，可以打印所有学员信息：
		public static void printAll(ArrayList<Student> stuList){}
	5.在MainApp中创建方法，可以找出身高最高的学员，并打印：
		public static void findMaxHeight(ArrayList<Student>stuList){}
	6.在main()方法中，分别调用三个方法：打印所有学员，找出身高最高的学员；
*/

public class Demo03 {
	public static void main(String[] args) {
		//创建容器
		ArrayList al = new ArrayList();
		
		//键盘录入
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 3; i++) {
			System.out.println("请录入第" + i + "个学员的信息(格式：a001,黄渤,男,20,1.72)：");
			String str = sc.next();
			//解析
			String[] strs = str.split(",");
			//将数据封装到对象中
			Person p = new Person(strs[0], strs[1], strs[2], Integer.parseInt(strs[3]), Double.parseDouble(strs[4]));
			//将对象存储到集合容器中
			al.add(p);
		}
		
		printAll(al);
		findMaxHeight(al);
	}
	//a001,黄渤,男,20,1.72
	//a002,孙红雷,男,22,1.78
	//a003,章子怡,女,18,1.64
	
	//找到最高的学员，并打印
	public static void findMaxHeight(ArrayList al) {
		Person max = (Person)al.get(0);
		
		for(int i = 1; i < al.size(); i++) {
			Person p = (Person)al.get(i);
			if(max.getHeight() < p.getHeight()) {
				max = p;
			}
		}
		
		System.out.println(max);
	}
	
	//打印学员信息
	public static void printAll(ArrayList al) {
		for (Object obj : al) {
			System.out.println(obj);
		}
	}
	
}

class Person {
	private String id;
	private String name;
	private String sex;
	private int age;
	private double height;
	
	public Person() {}

	public Person(String id, String name, String sex, int age, double height) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", height=" + height + "]";
	}
	
	
}
