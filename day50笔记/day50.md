### JdbcTemplate

~~~
什么是JdbcTemplate？
	它是Spring框架针对JDBC的封装，就是JDBC工具类
	它是一个基于ORM思想的工具类
	
	什么是ORM思想？
		ORM,对象关系映射(Object Relational Mapping)
		
		Java中一个类 对应 数据库中的一张表
		Java中的类中的成员变量(属性) 对应 数据库中的表中的字段
		
JdbcTemplate的使用？
	第一步：导入相关jar包
		有5个jar包
		
	第二步：创建JdbcTemplate对象
		JdbcTemplate jt = new JdbcTemplate(DruidUtils.getDataSource());
		------------------------------------------------------------------
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(DruidUtils.getDataSource());
	
	第三步：调用方法，对数据库进行增删改查操作
		update()：增删改操作
			添加操作：
				jt.update("insert into user (name, age) values(?, ?)", "lucy", 23);
				
			修改操作：
				jt.update("update user set name = ?, age = ? where id = ?", "bob", 21, 7);
				
			删除操作：
				jt.update("delete from user where id = ?", 7);
			
		query()：查询
			查询所有：
				List<User> users = jt.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
                for (User user : users) {
                    System.out.println(user);
                }
                
            查询id为1和3的用户信息：
            	List<User> users = jt.query("select * from user where id in (?, ?)", new BeanPropertyRowMapper<User>(User.class), 1, 3);
                for (User user : users) {
                    System.out.println(user);
                }
		
		queryForObject()：查询
			查询id为1的用户信息：
				User user = jt.queryForObject("select * from user where id = ?", new BeanPropertyRowMapper<User>(User.class), 1);
				System.out.println(user);
			
			查询id为2的用户的名字是什么：
				String name = jt.queryForObject("select name from user where id = ?", String.class, 2);
				System.out.println(name);
				
			查询总条数：
            	int count = jt.queryForObject("select count(*) from user", int.class);
            	System.out.println(count);

~~~

### MyBatis

~~~
什么是MyBatis？
	MyBatis本是apache的一个开源项目iBatis，2010年这个项目由apache software foundation迁移到了google code，并且改名为MyBatis。2013年11月迁移到Github。iBATIS一词来源于“internet”和“abatis”的组合，是一个基于Java的持久层框架。iBATIS提供的持久层框架包括SQL Maps和Data Access Objects（DAOs）
	
	MyBatis是一个基于ORM思想的持久层框架(半成品软件)

	有哪些技术可以使用Java操作数据库？
		1.JDBC
		2.JdbcTemplate(JDBC工具类，ORM)
		3.MyBatis(框架，ORM)
		
MyBatis的优点？
	1.简单易学：本身就很小且简单。没有任何第三方依赖，最简单安装只要两个jar文件+配置几个sql映射文件。易于学习，易于使用。通过文档和源代码，可以比较完全的掌握它的设计思路和实现。
	2.灵活：mybatis不会对应用程序或者数据库的现有设计强加任何影响。 sql写在xml里，便于统一管理和优化。通过sql语句可以满足操作数据库的所有需求。
	3.解除sql与程序代码的耦合：通过提供DAO层，将业务逻辑和数据访问逻辑分离，使系统的设计更清晰，更易维护，更易单元测试。sql和代码的分离，提高了可维护性。
	4.提供映射标签，支持对象与数据库的ORM字段关系映射。
	5.提供对象关系映射标签，支持对象关系组建维护。
	5.提供xml标签，支持编写动态sql。

MyBatis的入门小案例？
	实现步骤：
		1.导入相关jar包
			2个jar包
			
		2.编写JavaBean类
			class User {
				private int id;
				private String name;
				private int age;
				.......
			}
			
		3.编写Dao接口
			public interface UserDao {
                public List<User> findAll();
            }

		4.编写MyBatis核心配置文件
			<?xml version="1.0" encoding="UTF-8" ?>
            <!DOCTYPE configuration
            PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
            "http://mybatis.org/dtd/mybatis-3-config.dtd">
            <configuration>
                <environments default="mysql">
                    <environment id="mysql">
                        <transactionManager type="JDBC"/>
                        <dataSource type="POOLED">
                            <property name="driver" value="com.mysql.jdbc.Driver"/>
                            <property name="url" value="jdbc:mysql://localhost:3306/db3"/>
                            <property name="username" value="root"/>
                            <property name="password" value="123"/>
                        </dataSource>
                    </environment>
                </environments>

                <mappers>
                    <mapper resource="com/dao/UserMapper.xml"/>
                </mappers>
            </configuration>
		
		5.编写MyBatis映射文件
			<?xml version="1.0" encoding="UTF-8" ?>
            <!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
            "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
            <mapper namespace="com.dao.UserDao">
                <select id="findAll" resultType="com.pojo.User">
                    select * from user
                </select>
            </mapper>
		
		6.编写测试类，进行测试
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
~~~

