package com.dao;

import java.util.List;
import com.pojo.User;

public interface UserDao {
	public List<User> findAll();
}
