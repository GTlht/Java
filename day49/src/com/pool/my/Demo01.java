package com.pool.my;

import java.sql.Connection;

public class Demo01 {
	public static void main(String[] args) {
		for(int i = 1; i <= 7; i++) {
			//获取数据库连接对象
			Connection conn = SimpleConnectionPool.getConnection();
			
			System.out.println(conn);
			
			if(i == 3) {
				SimpleConnectionPool.close(conn);
			}
			
			//归还
			//SimpleConnectionPool.close(conn);
		}
	}
}
