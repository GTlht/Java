package com.pool.druid;

import java.sql.Connection;
import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		//创建数据库连接池对象
		DruidDataSource dataSource = new DruidDataSource();
		
		//设置参数
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/db3");
		dataSource.setUsername("root");
		dataSource.setPassword("123");
		
		//获取数据库连接对象
		Connection conn = dataSource.getConnection();
		
		System.out.println(conn);
		
		//归还数据库连接对象
		conn.close();
	}
}
