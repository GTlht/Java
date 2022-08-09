package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Demo08 {
	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "123");
		
		//获取执行sql语句对象
		Statement stat = conn.createStatement();
		
		//执行sql语句
		ResultSet rs = stat.executeQuery("select * from user");
		
		//创建集合容器
		ArrayList<User> users = new ArrayList<User>();
	
		//解析结果集
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			
			//创建对象，封装数据
			User user = new User(id, name, age);
			//将对象存储到集合容器中
			users.add(user);
		}
		
		//释放资源
		rs.close();
		stat.close();
		conn.close();
		
		//遍历集合容器
		for (User user : users) {
			System.out.println(user);
		}
	}
}

class User {
	private int id;
	private String name;
	private int age;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
}