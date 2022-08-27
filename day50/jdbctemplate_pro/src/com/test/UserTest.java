package com.test;

import java.util.List;

import org.junit.Test;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.pojo.User;

public class UserTest {
	private UserDao userDao = new UserDaoImpl();
	
	@Test
	public void add() {
		User user = new User();
		user.setName("lucy");
		user.setAge(22);
		userDao.add(user);
	}
	
	@Test
	public void update() {
		User user = new User(6, "bob", 30);
		userDao.update(user);
	}
	
	@Test
	public void delete() {
		userDao.delete(6);
	}
	
	@Test
	public void findAll() {
		List<User> users = userDao.findAll();
		for (User user : users) {
			System.out.println(user);
		}
	}
	
	@Test
	public void findById() {
		User user = userDao.findById(1);
		System.out.println(user);
	}
	
	@Test
	public void count() {
		int count = userDao.count();
		System.out.println(count);
	}
}
