package com.pool.c3p0;

import java.sql.Connection;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
		for(int i = 1; i <= 12; i++) {
			Connection conn = dataSource.getConnection();
			System.out.println(conn);
			
			if(i == 5) {
				conn.close();
			}
		}
	}
}
