package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.util.JdbcUtils;

public class Demo13 {
	public static void main(String[] args) throws Exception {
		/*//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "123");*/	
		Connection conn = JdbcUtils.getConnection();
		
		//获取执行sql语句对象
		//修改操作
		PreparedStatement ps = conn.prepareStatement("update user set name = ?, age = ? where id = ?");
		ps.setString(1, "jerry");
		ps.setInt(2, 19);
		ps.setInt(3, 1);
		
		//执行sql语句
		int i = ps.executeUpdate();
		System.out.println(i);
		
		//释放资源
		/*ps.close();
		conn.close();*/
		JdbcUtils.close(conn, ps);
	}
}
