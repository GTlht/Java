package com.dao;

import java.util.List;

import com.pojo.User;

public interface UserDao {
	//添加
	public void add(User user);
	
	//修改
	public void update(User user);
	
	//删除
	public void delete(int id);
	
	//查询所有
	public List<User> findAll();
	
	//根据id查询单条记录
	public User findById(int id);
	
	//查询总记录数
	public int count();
}
