package com.jdbctemplate;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.pojo.User;
import com.util.DruidUtils;

public class Demo02 {
	public static void main(String[] args) {
		//创建JdbcTemplate对象
		JdbcTemplate jt = new JdbcTemplate(DruidUtils.getDataSource());
		
		//查询所有用户信息
		/*List<User> users = jt.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
		for (User user : users) {
			System.out.println(user);
		}*/
		
		//查询id为1和3的用户信息
		List<User> users = jt.query("select * from user where id in (?, ?)", new BeanPropertyRowMapper<User>(User.class), 1, 3);
		for (User user : users) {
			System.out.println(user);
		}
	
	}
}
