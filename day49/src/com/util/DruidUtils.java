package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.pool.druid.Demo03;

public class DruidUtils {
	private static DataSource dataSource;
	
	static {
		try {
			//创建数据库连接池对象
			Properties p = new Properties();
			p.load(Demo03.class.getClassLoader().getResourceAsStream("druid.properties"));
			dataSource = DruidDataSourceFactory.createDataSource(p);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static DataSource getDataSource() {
		return dataSource;
	}
	
	public static Connection getConnection() throws Exception {
		return dataSource.getConnection();
	}
	
	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if(conn != null) {
			try {
				conn.close();
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
		
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Connection conn, PreparedStatement ps) {
		close(conn, ps, null);
	}
}
