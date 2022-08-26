package com.pool.druid;

import java.sql.Connection;
import java.util.Properties;
import javax.sql.DataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//创建数据库连接池对象
		Properties p = new Properties();
		p.load(Demo01.class.getClassLoader().getResourceAsStream("druid.properties"));
		DataSource dataSource = DruidDataSourceFactory.createDataSource(p);
		
		//获取数据库连接对象
		Connection conn = dataSource.getConnection();
		
		System.out.println(conn);
		
		//归还数据库连接对象
		conn.close();
	}
}
