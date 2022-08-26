### 数据库连接池

~~~
什么是数据库连接池？
	数据库连接池其实就一个容器，该容器中存储了一些数据库连接对象(Connection)

	池子思想？
		连接池，线程池... ... 

数据库连接池的作用？
	没有数据库连接池的时候？
		每次想要获取数据库连接对象，都要现去创建一个对象，用完还要释放资源，这样效率不高，不省时
	有数据库连接池的时候？
		每次想要获取数据库连接对象，还需要从池子中拿即可，用完再扔回到池子中即可，节省时间，效率高

自定义数据库连接池？
	public class SimpleConnectionPool {
        private static LinkedList<Connection> pool = new LinkedList<>();

        static {
            try {
                //给池子提前添加一些Connection对象
                for(int i = 1; i <= 5; i++) {
                    pool.add(JdbcUtils.getConnection());
                }
            } catch(Exception e) {
                System.out.println("数据库连接池初始化失败~");
            }
        }

        //获取数据库连接对象
        public static synchronized Connection getConnection() {
            if(pool.size() > 0) {
                return pool.removeFirst();
            }

            throw new RuntimeException("对不起，已经没有连接池对象，请稍后再来~");
        }

        //归还数据库连接对象
        public static void close(Connection conn) {
            pool.addLast(conn);
        }
	}
	
第三方提供的数据库连接池？
	C3P0, druid
	
	注意：第三方提供的数据库连接池，我们在使用的时候都是需要导入相关jar包的

	DataSource：
		public Connection getConnection()：从池子中获取数据库连接对象
	
	Connection：
		public void close()：释放资源
		注意：如果Connection对象是通过DriverManager.getConnection()这种方式获取到的话，那调用close()是释放资源的意思。如果Connection对象是通过从池子中获取到的，那调用close()是归还到池子中的意思。

C3P0数据库连接池？
	配置文件版本：
		第一步：导入相关jar包
			有2个jar包
			
		第二步：拷贝相关配置文件
			c3p0-config.xml
			
			注意：配置文件的名字不能修改，固定的
			
		第三步：创建数据库连接池对象
			DataSource dataSouce = new ComboPooledDataSource();
		
		第四步：获取数据库连接对象
			Connection conn = dataSource.getConnection();
			
		第五步：归还数据库连接对象
			conn.close();
		
	非配置文件版本：
		第一步：导入相关jar包
			有2个jar包
			
		第二步：创建数据库连接池对象
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			
		第三步：设置参数
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/db3");
            dataSource.setUser("root");
            dataSource.setPassword("123");
	
		第四步：获取数据库连接对象
			Connection conn = dataSource.getConnection();
			
		第五步：归还数据库连接对象
			conn.close();

Druid数据库连接池？
	配置文件版本：
		第一步：导入相关jar
			有1一个jar包
			
		第二步：拷贝相关配置文件
			druid.properties
		
		第三步：创建数据库连接池对象
		   Properties p = new Properties();
           p.load(Demo01.class.getClassLoader().getResourceAsStream("druid.properties"));
		   DataSource dataSource = DruidDataSourceFactory.createDataSource(p);

		第四步：获取数据库连接对象
			Connection conn = dataSource.getConnection();
		
		第五步：归还数据库连接对象
			conn.close();
			
	非配置文件版本：
		第一步：导入相关jar
			有1一个jar包
			
		第二步：创建数据库连接池对象
			DruidDataSource dataSource = new DruidDataSource();
			
		第三步：设置参数
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:3306/db3");
            dataSource.setUsername("root");
            dataSource.setPassword("123");

		第四步：获取数据库连接对象
			Connection conn = dataSource.getConnection();

		第五步：归还数据库连接对象
			conn.close();
~~~

### Junit单元测试

~~~
@Test
@Before
@After
~~~

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
		jt.update("insert into user values(?,?,?)", 6, "tony", 30);








~~~

