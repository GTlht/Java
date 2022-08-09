package com.jdbc;

import java.sql.Connection;

import com.util.JdbcUtils;

public class Demo16 {
	public static void main(String[] args) throws Exception {
		for(int i = 1; i <= 10; i++) {
			Connection conn = JdbcUtils.getConnection();
			System.out.println(conn);
		}
	}
}
