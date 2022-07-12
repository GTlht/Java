package com.work;

import java.util.ArrayList;

/*
2.请按以下要求编写代码：
	1.定义Student类，包含以下属性：
		学号、姓名、身高
	2.定义MainApp类，包含main()方法；
	3.在main()方法中，创建一个可以存储Student对象的集合对象；
	4.创建以下几个Student对象：
		学号		姓名		身高	
		a001		黄渤		1.72
		a002		孙红雷		1.78
		a003		章子怡		1.64
		a004		杨颖		1.68
	5.将上面几个对象添加到集合中
	6.遍历集合打印每个对象的属性值；
	7.获取并打印集合大小；
	8.获取第3个学员对象，并打印其属性值；
	9.移除掉第4个学员对象；
	10.再次获取并打印集合大小；
	11.将第一个对象替换为以下对象：
		a005	撒贝宁	1.67
	12.遍历集合，打印出身高在1.70以上的学员信息;
	13.遍历集合，打印出“孙”姓的学员信息;
*/

public class Demo02 {
	public static void main(String[] args) {
		//创建容器
		ArrayList al = new ArrayList();
		
		//添加元素
		al.add(new Student("9527","tom",1.78));
		al.add(new Student("9528","jerry",1.78));
		al.add(new Student("9529","jack",1.80));
		al.add(new Student("9530","mary",1.65));
		al.add(new Student("9531","tony",1.69));
		
		//遍历
		for (Object obj : al) {
			System.out.println(obj);
		}
		
		System.out.println(al.size());
		
		Object obj = al.get(2);
		System.out.println(obj);
		
		al.remove(3);
		System.out.println(al);
		
		System.out.println(al.size());
		
		al.set(0, new Student("9531", "乔治", 1.3));
		System.out.println(al);
		
		for (Object o : al) {
			Student s = (Student)o;
			if(s.getHeight() > 1.7) {
				System.out.println(s);
			}
		}
		
		for (Object o : al) {
			Student s = (Student)o;
			if(s.getName().startsWith("乔")) {
				System.out.println(s);
			}
		}
	}
}

class Student {
	private String id;
	private String name;
	private double height;
	
	public Student() {}

	public Student(String id, String name, double height) {
		super();
		this.id = id;
		this.name = name;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", height=" + height + "]";
	}
	
	
	
}
