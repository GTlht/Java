package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo06 {
	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "123");
		
		//获取执行sql语句对象
		Statement stat = conn.createStatement();
		
		//执行sql语句
		//ResultSet executeQuery(String sql)
		ResultSet rs = stat.executeQuery("select * from user");
		while(rs.next()) {
			/*//Object getObject(int columnIndex)
			Object id = rs.getObject(1);
			Object name = rs.getObject(2);
			Object age = rs.getObject(3);
			System.out.println(id + "..." + name + "..." + age);*/
			
			/*//Object getObject(String columnLabel)
			Object id = rs.getObject("id");
			Object name = rs.getObject("name");
			Object age = rs.getObject("age");
			System.out.println(id + "..." + name + "..." + age);*/
			
			/*//int getInt(int columnIndex)
			int id = rs.getInt(1);
			//String getString(int columnIndex)
			String name = rs.getString(2);
			//int getInt(int columnIndex)
			int age = rs.getInt(3);
			System.out.println(id + "..." + name + "..." + age);*/
			
			//int getInt(String columnLabel)
			int id = rs.getInt("id");
			//String getString(String columnLabel)
			String name = rs.getString("name");
			//int getInt(String columnLabel)
			int age = rs.getInt("age");
		
			System.out.println(id + "..." + name + "..." + age);
		}
	}
}
