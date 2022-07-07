### Calendar

~~~
什么是Calendar类？
	Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法
	日期时间类
	
常见的成员方法？
	public static Calendar getInstance()：获取Calendar实例
	public int get(int field)：返回给定日历字段的值
	public void set(int field,int value)：将给定的日历字段设置为给定值
	public final Date getTime()：将Calendar转换成Date
	public abstract void add(int field,int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量

练习题？
	键盘录入一个年份，判断该年份是平年还是闰年？
~~~

### Arrays

~~~
什么是Arrays类？
	此类包含用来操作数组（比如排序和搜索）的各种方法
	数组工具类
	
常见的成员方法？
	public static void sort(int[] a)：对指定 int 型数组的指定范围按数字升序进行排序
	public static String toString(int[] a)： 返回指定数组内容的字符串表示形式
	public static int[] copyOf(int[] original,
                           int newLength)： 复制指定的数组
~~~

### UUID

~~~
什么是UUID类？
	表示通用唯一标识符 (UUID) 的类
	目的：为了生成唯一的标识符

常见的成员方法？
	public static UUID randomUUID()：获取UUID对象
	public String toString()：将UUID类型转换成String类型
~~~

### Random

~~~
什么是Random类？
	此类的实例用于生成伪随机数流

常见的构造方法？
	public Random()：创建一个新的随机数生成器

常见的成员方法？
	public int nextInt(int n)：返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值
	
练习题？
	生成一个随机正整数，范围1-100？
		方式一：
			(int)(Math.random()*100) + 1
			
		方式二：
			Random random = new Random();
			random.nextInt(100) + 1;
~~~

### BigDecimal

~~~
什么是BigDecimal类？
	为了使小数运算的到的结果更加精准

常见的构造方法？
	public BigDecimal(int val)：将 int 转换为 BigDecimal
	public BigDecimal(double val)：将 double 转换为 BigDecimal
	*public BigDecimal(String val)：将 BigDecimal 的字符串表示形式转换为 BigDecimal
	
	注意：如果想要实现小数运算得到的结果更加精确的话，建议使用参数为字符串的有参构造方法

常见的成员方法？
	public BigDecimal add(BigDecimal augend)：加法运算
	public BigDecimal subtract(BigDecimal subtrahend)：减法运算
	public BigDecimal multiply(BigDecimal multiplicand)：乘法运算
	public BigDecimal divide(BigDecimal divisor)：除法运算
	public BigDecimal divide(BigDecimal divisor,
                         int scale,
                         int roundingMode)：除法运算
                         
                       divisor - 此 BigDecimal 要除以的值。
                       scale - 保留几位小数。
                       roundingMode - 要应用的舍入模式
                       		ROUND_DOWN：去尾
                       		ROUND_UP：前进
                       		ROUND_HALF_UP：四舍五入
~~~

### jdk1.8新增加的日期时间类

~~~
LocalDate类？
	LocalDate是一个不可变的日期时间对象，表示日期，通常被视为年月日
	
	2022.7.7

LocalTime类？
	LocalTime是一个不可变的日期时间对象，代表一个时间，通常被看作是小时 - 秒。 时间表示为纳秒精度
	
	12:12:12.432

LocalDateTime类？
	LocalDateTime是一个不可变的日期时间对象，代表日期时间，通常被视为年 - 月 - 日 - 时 - 分 - 秒

	2022.7.7 12:12:12.432
	
	常见的成员方法？
		1.获取LocalDateTime对象的相关方法
			public static LocalDateTime now()：从默认时区的系统时钟获取当前的日期时间
			public static LocalDateTime of(int year,
                               Month month,
                               int dayOfMonth,
                               int hour,
                               int minute,
                               int second)：从年，月，日，小时，分钟和秒获得LocalDateTime的实例
		
		2.获取年月日时分秒相关的方法
			public int getYear()：获取年
			public int getMonthValue()：获取月份
			public int getDayOfMonth()：获取日
			public int getHour()：获取小时
			public int getMinute()：获取分钟
			public int getSecond()：获取秒
		
		3.转换相关的方法
			public LocalDate toLocalDate()：将LocalDateTime转换成LocalDate
			public LocalTime toLocalTime()：将LocalDateTime转换成LocalTime
		
		4.格式化和解析相关的方法
			public String format(DateTimeFormatter formatter)：格式化
			public static LocalDateTime parse(String text,
											  DateTimeFormatter formatter)：解析
			
            DateTimeFormatter类：
				public static DateTimeFormatter ofPattern(String pattern)：获取DateTimeFormatter对象
				
			格式化操作？
				LocalDateTime -> String
				
				//获取LocalDateTime对象
                LocalDateTime localDateTime = LocalDateTime.now();

                System.out.println(localDateTime);

                //格式化
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss E");
                String time = localDateTime.format(dateTimeFormatter);
                System.out.println(time);
			
			解析操作？
				String -> LocalDateTime
				
				//创建一个字符串
                String s = "2012-07-07 12:12:12";

                //解析操作
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime localDateTime = LocalDateTime.parse(s, dateTimeFormatter);
                System.out.println(localDateTime);
		
		5.增强和减量相关的方法
			public LocalDateTime plusYears(long years)：增加或者减少
			public LocalDateTime plusXXX(long xxx)
		
		6.修改相关的方法
			public LocalDateTime withYear(int year)：修改年
			public LocalDateTime withXXX(int xxx)
	
练习题？
	已知String s = "2022-07-07"，要求将天数增加1天，变成String s = "2022-07-08"？
		方式一：
		方式二：

~~~

