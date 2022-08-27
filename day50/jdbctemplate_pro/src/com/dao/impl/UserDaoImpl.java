package com.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.dao.UserDao;
import com.pojo.User;
import com.util.DruidUtils;

public class UserDaoImpl implements UserDao {
	private JdbcTemplate jt = new JdbcTemplate(DruidUtils.getDataSource());
	
	@Override
	public void add(User user) {
		jt.update("insert into user values(null, ?, ?)", user.getName(), user.getAge());
	}

	@Override
	public void update(User user) {
		jt.update("update user set name = ?, age = ? where id = ?", user.getName(), user.getAge(), user.getId());
	}

	@Override
	public void delete(int id) {
		jt.update("delete from user where id = ?", id);
	}

	@Override
	public List<User> findAll() {
		List<User> users = jt.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
		return users;
	}

	@Override
	public User findById(int id) {
		try {
			User user = jt.queryForObject("select * from user where id = ?", new BeanPropertyRowMapper<User>(User.class), id);
			return user;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public int count() {
		int count = jt.queryForObject("select count(*) from user", int.class);
		return count;
	}

}
