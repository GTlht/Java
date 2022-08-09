package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo05 {
	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "123");
		
		//获取执行sql语句对象
		Statement stat = conn.createStatement();
		
		//执行sql语句
		//int executeUpate(String sql)
		/*int i = stat.executeUpdate("update user set name = 'jerry' where id = 1");
		System.out.println(i);*/
		
		int i = stat.executeUpdate("delete from user where id = 1");
		System.out.println(i);
		
		
	}
}
