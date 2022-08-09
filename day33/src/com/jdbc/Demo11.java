package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) throws Exception {
		//键盘录入用户名和密码
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入用户名：");
		String username = sc.nextLine();
		System.out.println("请录入密码：");
		String password = sc.nextLine();
		
		//判断用户名和密码是否存在
		boolean flag = login(username, password);
		if(flag) {
			System.out.println("登录成功");
		} else {
			System.out.println("登录失败");
		}
	}
	
	public static boolean login(String username, String password) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "123");
		
		//获取执行sql语句对象
		//Statement stat = conn.createStatement();
		PreparedStatement ps = conn.prepareStatement("select * from user where username = ? and password = ?");
		//给占位符赋值
		ps.setString(1, username);
		ps.setString(2, password);
		
		//执行sql语句
		ResultSet rs = ps.executeQuery();
		
		return rs.next();
	}
}
