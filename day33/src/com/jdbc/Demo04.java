package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo04 {
	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//获取数据库连接对象
		/*Properties p = new Properties();
		p.setProperty("user", "root");
		p.setProperty("password", "123");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", p);
		System.out.println(conn);*/
		
		/*Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3?user=root&password=123");
		System.out.println(conn);*/
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "123");
		System.out.println(conn);
	}
}
