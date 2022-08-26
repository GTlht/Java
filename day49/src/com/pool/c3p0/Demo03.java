package com.pool.c3p0;

import java.beans.PropertyVetoException;
import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo03 {
	public static void main(String[] args) throws Exception {
		//创建数据库连接池对象
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
		//设置参数
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/db3");
		dataSource.setUser("root");
		dataSource.setPassword("123");
		
		//获取数据库连接对象
		Connection conn = dataSource.getConnection();
		
		System.out.println(conn);
		
		//归还数据库连接对象
		conn.close();
	}
}
