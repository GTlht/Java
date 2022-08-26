package com.pool.my;

import java.sql.Connection;
import java.util.LinkedList;

import com.util.JdbcUtils;

//自定义数据库连接池
public class SimpleConnectionPool {
	private static LinkedList<Connection> pool = new LinkedList<>();
	
	static {
		try {
			//给池子提前添加一些Connection对象
			for(int i = 1; i <= 5; i++) {
				pool.add(JdbcUtils.getConnection());
			}
		} catch(Exception e) {
			System.out.println("数据库连接池初始化失败~");
		}
	}
	
	//获取数据库连接对象
	public static synchronized Connection getConnection() {
		if(pool.size() > 0) {
			return pool.removeFirst();
		}
		
		throw new RuntimeException("对不起，已经没有连接池对象，请稍后再来~");
	}
	
	//归还数据库连接对象
	public static void close(Connection conn) {
		pool.addLast(conn);
	}
}
