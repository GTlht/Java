package com.jdbc;

import java.sql.Connection;
import com.util.JdbcUtils;

public class Demo03 {
	public static void main(String[] args) throws Exception {
		for(int i = 1; i <= 10; i++) {
			//获取数据库连接对象
			Connection conn = JdbcUtils.getConnection();
			
			System.out.println(conn);
			
			//释放资源
			conn.close();
		}
	}
}
