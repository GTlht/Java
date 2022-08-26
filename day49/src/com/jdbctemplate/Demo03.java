package com.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import com.util.DruidUtils;

public class Demo03 {
	public static void main(String[] args) {
		//创建JdbcTemplate对象
		JdbcTemplate jt = new JdbcTemplate(DruidUtils.getDataSource());
		
		//添加操作
		//int i = jt.update("insert into user values(5, 'mary', 28)");
		jt.update("insert into user values(?,?,?)", 6, "tony", 30);
	}
}
