package com.work;
/*
6.根据需求写代码
一、有以下数据：
    1.三个老师信息：
	教师编号 	               姓名	性别	年龄	科目
	t001		薛之谦	男	26	Java
	t002		张碧晨	女	24	IOS
	t003		张杰	男	28	Java
	2.存储两个科目信息：
	课程编号		名称	创建时间		课程描述
	s001		Java	2020-02-08	Java学科，包含JavaSE和JavaEE
	s002		IOS	2020-02-09	IOS系统开发
二、请分别定义两个类；
三、创建MainApp类中，包含main()方法，创建相应对象，通过构造方法给成员变量赋值。
四、打印每个对象的所有属性。
要求：每个类要按照封装的原则进行定义。并提供无参和全参的构造方法。
*/
public class Demo03 {
	public static void main(String[] args) {
		Teacher t = new Teacher("9527", "tom", "男", 18, "英语");
		t.show();
		
		Subject s = new Subject("001", "英语", "2022-06-30", "美式英语");
		s.show();
	}
}

class Teacher {
	private String id;
	private String name;
	private String gender;
	private int age;
	private String subject;
	
	public Teacher() {}
	
	public Teacher(String id, String name, String gender, int age, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.subject = subject;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void show() {
		System.out.println(id + "..." + name + "..." + gender + "..." + age + "..." + subject);
	}
}

class Subject {
	private String id;
	private String name;
	private String createtime;
	private String desc;
	
	public Subject() {}

	public Subject(String id, String name, String createtime, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.createtime = createtime;
		this.desc = desc;
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

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void show() {
		System.out.println(id + "..." + name + "..." + createtime + "..." + desc);
	}
	
	
}
