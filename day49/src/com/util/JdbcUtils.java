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
			//加载配置文件
			Properties p = new Properties();
			p.load(JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties"));
			
			//获取数据
			driver = p.getProperty("driver");
			url = p.getProperty("url");
			username = p.getProperty("username");
			password = p.getProperty("password");
			
			//注册驱动
			Class.forName(driver);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws Exception {
		return DriverManager.getConnection(url, username, password);
	}
	
	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if(ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(rs != null) {
			try {
				rs.close();
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
}
