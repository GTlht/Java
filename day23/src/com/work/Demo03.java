package com.work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
3.将文件name.txt中的以下数据：
	张三,18,男银
	李四,20,女银
	...
	...
需求：将文件中李四的名字修改为王五，其他不变
*/
public class Demo03 {
	public static void main(String[] args) throws IOException {
		//创建高效字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("name.txt"));
		
		//创建容器
		ArrayList<Person> al = new ArrayList<>();
		
		//一次读取一行
		String line = null;
		while((line = br.readLine()) != null) {
			//解析
			String[] strs = line.split(",");
			//封装
			Person p = new Person(strs[0], Integer.parseInt(strs[1]), strs[2]);
			//将对象存储到容器中
			al.add(p);
		}
		
		//释放资源
		br.close();
		
		//查找李四这个人，将名字改为王五
		//遍历容器
		for (Person p : al) {
			if("李四".equals(p.getName())) {
				//修改
				p.setName("王五");
			}
		}
		
		//写出到文件中
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("name.txt"));
		
		//一次写出一个字符串
		//遍历容器
		for (Person p : al) {
			bw.write(p.getName() + "," + p.getAge() + "," + p.getSex());
			bw.newLine();
		}
		
		//释放资源
		bw.close();
	}
}

class Person {
	private String name;
	private int age;
	private String sex;
	public Person(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
}