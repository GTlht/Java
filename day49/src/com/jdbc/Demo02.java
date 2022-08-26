package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.JdbcUtils;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		//获取数据库连接对象
		Connection conn = JdbcUtils.getConnection();
		
		//获取执行执行sql语句对象
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
		JdbcUtils.close(conn, ps, rs);
	}
}
