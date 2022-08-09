package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo07 {
	public static void main(String[] args) throws Exception {
		//1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "123");
		
		//3.获取执行sql语句对象
		Statement stat = conn.createStatement();
		
		//执行sql语句
		//boolean execute(String sql)
		//boolean b = stat.execute("insert into user values(4,'jack',19)");
		//boolean b = stat.execute("update user set age = 20 where name = 'jack'");
		//boolean b = stat.execute("delete from user where id = 4");
		//boolean b = stat.execute("select * from user");
		boolean b = stat.execute("select * from user");
		if(b) {
			ResultSet rs = stat.getResultSet();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(id + "..." + name + "..." + age);
			}
		}
		//System.out.println(b);
	}
}
