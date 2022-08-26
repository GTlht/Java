package com.pool.druid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.sql.DataSource;

import org.junit.Test;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class Demo03 {
	@Test
	public void add() throws Exception {
		//创建数据库连接池对象
		Properties p = new Properties();
		p.load(Demo03.class.getClassLoader().getResourceAsStream("druid.properties"));
		DataSource dataSource = DruidDataSourceFactory.createDataSource(p);
		
		//获取数据库连接对象
		Connection conn = dataSource.getConnection();
		
		//获取执行sql语句对象
		PreparedStatement ps = conn.prepareStatement("insert into user values(null,?,?)");
		ps.setString(1, "tony");
		ps.setInt(2, 28);
		
		//执行sql语句
		ps.executeUpdate();
		
		//释放资源
		ps.close();
		conn.close();
	}
	
	@Test
	public void update() throws Exception {
		//创建数据库连接池对象
		Properties p = new Properties();
		p.load(Demo03.class.getClassLoader().getResourceAsStream("druid.properties"));
		DataSource dataSource = DruidDataSourceFactory.createDataSource(p);
		
		//获取数据库连接池对象
		Connection conn = dataSource.getConnection();

		//获取执行sql语句对象
		PreparedStatement ps = conn.prepareStatement("update user set name = ?, age = ? where id = ?");
		ps.setString(1, "mary");
		ps.setInt(2, 30);
		ps.setInt(3, 5);
		
		//执行sql语句
		ps.executeUpdate();
		
		//释放资源
		ps.close();
		conn.close();
	}
	
	@Test
	public void delete() throws Exception {
		//创建数据库连接池对象
		Properties p = new Properties();
		p.load(Demo03.class.getClassLoader().getResourceAsStream("druid.properties"));
		DataSource dataSource = DruidDataSourceFactory.createDataSource(p);
		
		//获取数据库连接对象
		Connection conn = dataSource.getConnection();
		
		//获取执行sql语句对象
		PreparedStatement ps = conn.prepareStatement("delete from user where id = ?");
		ps.setInt(1, 5);
		
		//执行sql语句
		ps.executeUpdate();
		
		//释放资源
		ps.close();
		conn.close();
	}
	
	@Test
	public void find() throws Exception {
		//创建数据库连接池对象
		Properties p = new Properties();
		p.load(Demo03.class.getClassLoader().getResourceAsStream("druid.properties"));
		DataSource dataSource = DruidDataSourceFactory.createDataSource(p);
		
		//获取数据库连接对象
		Connection conn = dataSource.getConnection();
		
		//获取执行sql语句对象
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
		rs.close();
		ps.close();
		conn.close();
	}
}
