package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.JdbcUtils;

public class Demo15 {
	public static void main(String[] args) throws Exception {
		/*//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "123");*/	
		Connection conn = JdbcUtils.getConnection();
		
		//获取执行sql语句对象
		//删除操作
		PreparedStatement ps = conn.prepareStatement("select * from user");
		
		//执行sql语句
		ResultSet rs = ps.executeQuery();
		
		//解析结果集
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			System.out.println(id + "..." + name + "..." + age);
		}
		
		//释放资源
		/*rs.close();
		ps.close();
		conn.close();*/
		JdbcUtils.close(conn, ps, rs);
	}
}
