package com.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

import com.util.DruidUtils;

public class Demo02 {
	public static void main(String[] args) {
		//创建JdbcTemplate对象
		/*Properties p = new Properties();
		p.load(Demo02.class.getClassLoader().getResourceAsStream("druid.properties"));
		DataSource dataSource = DruidDataSourceFactory.createDataSource(p);
		JdbcTemplate jt = new JdbcTemplate(dataSource);*/
		
		/*JdbcTemplate jt = new JdbcTemplate(DruidUtils.getDataSource());
		System.out.println(jt);*/
		
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(DruidUtils.getDataSource());
		System.out.println(jt);
	}
}
