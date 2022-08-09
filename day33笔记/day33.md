### JDBC

~~~
什么是JDBC？
	数据库连接（Java DataBase Connectivity）
	
JDBD的作用？
	可以实现使用Java语言来操作数据库
	
JDBC的本质？
	JDBC是SUN公司研发出来的一套规范，接口

JDBC入门案例？
	实现步骤：
		0.导入jar包
			需要导入一个mysql的jar包
		
		//1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "123");
		
		//3.获取执行sql语句对象
		Statement stat = conn.createStatement();
		
		//4.执行sql语句
		int i = stat.executeUpdate("insert into user values(1,'tom',18)");
		System.out.println(i);
		
		//5.释放资源
		stat.close();
		conn.close();
		
	步骤详情？
		0.导入jar包
			为什么要导入jar包，因为操作数据库的实现类和方法都在jar包中存在着，jar包中存放都是一些.class文件
			
		1.注册驱动
			注册驱动是为了告诉我们使用的是哪一个数据库，并且为后续连接数据库做一些提前的准备工作

			Class.forName("com.mysql.jdbc.Driver")：将com.mysql.jdbc文件夹下的Driver.class文件从本次磁盘加载到方法区中
			
			注册驱动的真实代码：
				DriverManager.registerDriver(new Driver());
				
			为什么我们不写真实的注册驱动代码，而是写另外一张方式呢？
				1.因为如果我们一旦写了真实代码，会造成二次注册
				2.这样写会增加耦合性，太过依赖于jar包的存在

		2.获取数据库连接对象
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "123");
			第一个参数：协议 + IP + 端口 + 数据库的名字
			第二个参数：数据库的用户名
			第三个参数：数据库的密码
			
			public static Connection getConnection(String url,String user, String password)
			public static Connection getConnection(String url,java.util.Properties info)
			public static Connection getConnection(String url)

			注意：如果使用的IP是localhost，数据库端口是3306的话，我们就可以简写为：
				jdbc:mysql://localhost:3306/db3 ---> jdbc:mysql:///db3

		3.获取执行sql语句对象
			Statement stat = conn.createStatement();
			
			注意：这个对象并不是我们最终要使用的对象，后面就会换对象，因为这种写法有弊端
			
		4.执行sql语句
			主要操作数据库无非就是增删改查四大操作
			
			insert into
			update set
			delete from
			select
			
			常见的方法？
				int executeUpate(String sql)：操作的是数据库的增删改，返回值是实际影响的行数
				ResultSet executeQuery(String sql)：操作的是数据库的查询
					ResultSet接口：
						boolean next()
						Object getObject(int columnIndex)
						Object getObject(String columnLabel)
						int getInt(int columnIndex)
						int getInt(String columnLabel)
						String getString(int columnIndex)
						String getString(String columnLabel)

				boolean execute(String sql)：操作的是数据库的增删改查
					如果是增删改操作，返回false
					如果是查询操作，返回true
			
		5.释放资源
        	数据库连接对象 Connection
            执行sql语句对象 Statement
            结果集对象 ResultSet
            
            以上三个都需要释放资源
            
练习题？
	题一：已知有一张表，里面自行存储几条记录信息，要求从表中获取到数据，将数据封装到对象中，再将对象存储到集合容器中，遍历集合，打印出每个对象的属性？
	
	题二：模拟用户登录功能，已知有一张表，表中有几条记录，我们要输入用户名和密码，如果表中存在该用户名和密码，则登录成功，否则登录失败？
		public class Demo09 {
            public static void main(String[] args) throws Exception {
                //键盘录入用户名和密码
                Scanner sc = new Scanner(System.in);
                System.out.println("请录入用户名：");
                String username = sc.nextLine();
                System.out.println("请录入密码：");
                String password = sc.nextLine();

                //判断用户名和密码是否存在
                boolean flag = login(username, password);
                if(flag) {
                    System.out.println("登录成功");
                } else {
                    System.out.println("登录失败");
                }
            }

            public static boolean login(String username, String password) throws Exception {
                //注册驱动
                Class.forName("com.mysql.jdbc.Driver");

                //获取数据库连接对象
                Connection conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "123");

                //获取执行sql语句对象
                Statement stat = conn.createStatement();

                //执行sql语句
                String sql = "select * from user where username = '" + username + "' and password = '" + password + "'";
                ResultSet rs = stat.executeQuery(sql);

                //释放资源
                /*rs.close();
                stat.close();
                conn.close();*/

                return rs.next();
            }
        }
        
		以上写法会引发SQL注入问题
        如何解决？
			采用占位符方式来解决sql注入
			PreparedStatement
		
Jdbc工具类？
	public class JdbcUtils {
        private static String driver;
        private static String url;
        private static String username;
        private static String password;

        static {
            try {
                //创建容器
                Properties p = new Properties();
                //加载配置文件
                p.load(JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties"));
                //初始化四大参数
                driver = p.getProperty("driver");
                url = p.getProperty("url");
                username = p.getProperty("username");
                password = p.getProperty("password");

                //注册驱动
                Class.forName(driver);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //获取数据库连接对象
        public static Connection getConnection() throws Exception {
            //获取数据库连接对象
            Connection conn = DriverManager.getConnection(url,username,password);
            return conn;
        }

        //释放资源
        public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        //释放资源
        public static void close(Connection conn, PreparedStatement ps) {
            close(conn, ps, null);
        }
    }
    
~~~

