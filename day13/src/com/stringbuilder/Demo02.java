package com.stringbuilder;

public class Demo02 {
	public static void main(String[] args) {
		//创建字符串缓冲区
		StringBuilder sb = new StringBuilder();
		
		//public StringBuilder append(XXX obj)
		/*StringBuilder sb1 = sb.append(12);
		System.out.println(sb == sb1);*/
		
		/*sb.append(12);
		System.out.println(sb);//"12"
		
		sb.append(false);
		System.out.println(sb);//"12false"
		
		sb.append('约');
		System.out.println(sb);
		
		Pig pig = new Pig("tom", 18);
		sb.append(pig);
		System.out.println(sb);*/
		
		//链式编程
		sb.append(12).append(false).append('约').append(new Pig("tom", 18));
		System.out.println(sb);
	}
}

class Pig {
	private String name;
	private int age;
	
	public Pig() {}

	public Pig(String name, int age) {
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
		return "Pig [name=" + name + ", age=" + age + "]";
	}
	
	
}