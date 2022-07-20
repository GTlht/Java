package com.objectoutputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		//创建序列化流对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
		
		//public final void writeObject(Object obj)
		Pig pig = new Pig("tom", 18);
		oos.writeObject(pig);
	}
}

class Pig implements Serializable {
	private String name;
	private int age;
	public Pig() {
		super();
		// TODO Auto-generated constructor stub
	}
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