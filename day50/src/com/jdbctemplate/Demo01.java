package com.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import com.util.DruidUtils;

public class Demo01 {
	public static void main(String[] args) {
		//创建JdbcTemplate对象
		JdbcTemplate jt = new JdbcTemplate(DruidUtils.getDataSource());
		
		//添加操作
		//jt.update("insert into user (name, age) values(?, ?)", "lucy", 23);
		
		//修改操作
		//jt.update("update user set name = ?, age = ? where id = ?", "bob", 21, 7);
		
		//删除操作
		jt.update("delete from user where id = ?", 7);
	}
}
