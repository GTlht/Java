package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", 
				"root", "123");
		
		//3.获取执行sql语句对象
		Statement stat = conn.createStatement();
		
		//4.执行sql语句
		int i = stat.executeUpdate("insert into user values(1,'tom',18)");
		System.out.println(i);
		
		//5.释放资源
		stat.close();
		conn.close();
	}
}
