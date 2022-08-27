package com.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dao.UserDao;
import com.pojo.User;

public class UserTest {
	public static void main(String[] args) throws Exception {
		//a.获取加载配置文件流对象
		InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
		
		//b.创建SqlSessionFactory构建者对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		
		//c.获取SqlSessionFactory对象
		SqlSessionFactory sqlSessionFactory = builder.build(is);
		
		//d.获取SqlSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//e.获取UserDao代理类对象
		UserDao userDao = sqlSession.getMapper(UserDao.class);
		
		//f.调用查询所有方法
		List<User> users = userDao.findAll();
		for (User user : users) {
			System.out.println(user);
		}
		
		//g.释放资源
		sqlSession.close();
	}
}
