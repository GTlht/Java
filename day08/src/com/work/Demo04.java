package com.work;

/*
4.分析以下需求，并用代码实现
	1.老师类Teacher
		属性:
			姓名name
			年龄age
		行为:
			吃饭
			讲课
	2.学生类Student
		属性:
			姓名name
			年龄age
		行为:
			吃饭eat()
			学习study()

 */

public class Demo04 {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setName("tom");
		t.setAge(28);
		System.out.println(t.getName() + "..." + t.getAge());
		
		/*Student s = new Student();
		s.setName("jerry");
		s.setAge(15);
		System.out.println(s.getName() + "..." + s.getAge());*/
	}
}

class Teacher {
	private String name;
	private int age;
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	public void eat() {
		System.out.println("吃米饭");
	}
	
	public void teach() {
		System.out.println("教Java");
	}
}

/*class Student {
	private String name;
	private int age;
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	public void eat() {
		System.out.println("吃肉");
	}
	
	public void study() {
		System.out.println("学习java");
	}
}*/
