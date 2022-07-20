package com.work;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
2.从控制台接收3名学员的信息，每条进行存储到一个Student对象中，将多个Student对象存储到一个集合中。
输入完毕后，将所有学员信息存储到文件Student.txt中。每名学员信息存储一行，多个属性值中间用逗号隔开。
*/

public class Demo02 {
	public static void main(String[] args) throws IOException {
		//键盘录入
		Scanner sc = new Scanner(System.in);
		
		//创建容器
		ArrayList<Student> al = new ArrayList<>();
		
		//循环3次
		for(int i = 1; i <= 3; i++) {
			System.out.println("请录入第" + i + "名学员的信息(格式：tom,18)：");
			String str = sc.next();
			
			//切割字符串，封装数据
			String[] strs = str.split(",");
			//创建对象
			Student s = new Student(strs[0], Integer.parseInt(strs[1]));
			//将学生存储到集合容器
			al.add(s);
		}
		
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
		
		//遍历容器
		for (Student student : al) {
			bw.write(student.getName() + "," + student.getAge());
			bw.newLine();
		}
		
		//释放资源
		bw.close();
	}
}

class Student {
	private String name;
	private int age;
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
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
