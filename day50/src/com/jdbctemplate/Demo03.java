package com.jdbctemplate;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pojo.User;
import com.util.DruidUtils;

public class Demo03 {
	public static void main(String[] args) {
		//创建JdbcTemplate对象
		JdbcTemplate jt = new JdbcTemplate(DruidUtils.getDataSource());
		
		//查询id为1的用户信息
		/*List<User> users = jt.query("select * from user where id = ?", new BeanPropertyRowMapper<User>(User.class), 1);
		for (User user : users) {
			System.out.println(user);
		}*/
		
		/*User user = jt.queryForObject("select * from user where id = ?", new BeanPropertyRowMapper<User>(User.class), 1);
		System.out.println(user);*/
		
		//查询id为2的用户的名字是什么
		/*String name = jt.queryForObject("select name from user where id = ?", String.class, 2);
		System.out.println(name);*/
		
		//查询id为3的用户的年龄是多少
		/*Integer age = jt.queryForObject("select age from user where id = ?", int.class, 3);
		System.out.println(age);*/
		
		//查询总条数
		int count = jt.queryForObject("select count(*) from user", int.class);
		System.out.println(count);
			
	}
}
