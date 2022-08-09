package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	static {
		try {
			//创建容器
			Properties p = new Properties();
			//加载配置文件
			p.load(JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties"));
			//初始化四大参数
			driver = p.getProperty("driver");
			url = p.getProperty("url");
			username = p.getProperty("username");
			password = p.getProperty("password");
			
			//注册驱动
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//获取数据库连接对象
	public static Connection getConnection() throws Exception {
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection(url,username,password);
		return conn;
	}
	
	//释放资源
	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//释放资源
	public static void close(Connection conn, PreparedStatement ps) {
		close(conn, ps, null);
	}
}
