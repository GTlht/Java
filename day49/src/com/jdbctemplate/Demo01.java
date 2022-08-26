package com.jdbctemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.util.DruidUtils;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//获取数据库连接对象
		Connection conn = DruidUtils.getConnection();
		
		//获取执行sql语句对象
		PreparedStatement ps = conn.prepareStatement("select * from user");
		
		//执行sql语句
		ResultSet rs = ps.executeQuery();
		
		//创建集合容器
		ArrayList<User> users = new ArrayList<>();
		
		//解析结果集
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			
			//创建对象
			User user = new User(id, name, age);
			//将对象封装到集合容器中
			users.add(user);
		}
		
		//释放资源
		DruidUtils.close(conn, ps, rs);
		
		//遍历集合容器
		for (User user : users) {
			System.out.println(user);
		}
	}
}
