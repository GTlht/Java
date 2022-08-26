package com.pool.c3p0;

import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//创建数据库连接池对象
		DataSource dataSource = new ComboPooledDataSource();
		
		//获取数据库连接对象
		Connection conn = dataSource.getConnection();
		
		System.out.println(conn);
		
		//归还数据库连接对象
		conn.close();
	}
}
