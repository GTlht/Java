### StringBuilder

~~~
什么是StringBuilder类？
	一个长度可变的字符序列
	字符串缓冲区，可以把它当成一个容器
	
	StringBuilder字符串缓冲区容器的特点？
		它可以存储任何数据类型的数据，但是只要装进去之后都变成了字符串，而且取不出来了

常见的构造方法？
	public StringBuilder()：构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符
	public StringBuilder(String str)： 构造一个字符串生成器，并初始化为指定的字符串内容，该字符串生成器的初始容量为 16 加上字符串参数的长度

常见的成员方法？
	public StringBuilder append(XXX obj)：在末尾追加数据
	public int capacity()：返回当前容量
	public int length()： 返回长度（字符数）
	public StringBuilder reverse()：将此字符序列用其反转形式取代
	public String toString()：将字符串缓冲区转换成字符串类型
	
String和StringBuilder相互转换？
	String -> StringBuilder：
		public StringBuilder(String str)
	
	StringBuilder -> String：
		public String toString()
	
练习题？
	题一：已知有一个字符串String s = "abcde"，要求将字符串中的内容进行反转，String s = "edbca"，打印到控制台？
	
	题二：键盘接收一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
			对称字符串：123321,111
			非对称字符串：123123
			
StringBuilder和StringBuffer的关系？
	它们两个是兄弟
	StringBuilder中具备的方法在StringBuffer也存在
~~~

### Math

~~~
什么是Math类？
	Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数
	数学工具类
	
	工具类：
		1.构造被私有，外界不能创建对象
		2.所有方法都是静态的，让我们通过类名调用

常见的成员方法？
	public static int abs(int a)：返回 int 值的绝对值
	public static double ceil(double a)：向上取整
	public static double floor(double a)：向下取整
	public static int max(int a,int b)：获取两个数的最大值
	public static int min(int a, int b)：获取两个数的最小值
	public static double pow(double a, double b)： 返回第一个参数的第二个参数次幂的值
	public static long round(double a)：返回最接近参数的 long，四舍五入
	public static double random()：返回带正号的 double 值，该值大于等于 0.0 且小于 1.0
								 产生随机数，该数字的范围[0.0,1.0)
								 
		练习：实现能够获取1-100之间的随机正整数的方式？
			int num = (int)(Math.random() * 100) + 1
			
		12到59之间的随机正整数
~~~

### 基本数据类型包装类

~~~
什么是基本数据类型包装类？
	是指8个基本数据类型所对应的8个引用数据类型

基本数据类型包装类分类？
	byte		->			Byte
	short		->			Short
	int			->			Integer
	long		->			Long
	float		->			Float
	double		->			Double
	boolean		->			Boolean
	char		->			Character
~~~

### Integer

~~~
什么是Integer类？
	Integer 类在对象中包装了一个基本类型 int 的值
	Integer就是int类型的包装类型

常见的构造方法？
	public Integer(int value)：构造一个新分配的 Integer 对象，它表示指定的 int 值
							  可以将int类型转换成Integer类型
	public Integer(String s)：构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值
							  可以将数字格式的字符串转换成Integer类型

常见的成员方法？
	public int intValue()：将Integer类型转换int类型
	*public static int parseInt(String s)：将数字格式的字符串转换成int类型
	public String toString()：将Integer类型转换成String类型
	public static String toString(int i)：将int类型转换成String类型
	public static Integer valueOf(int i)：将int类型转换成Integer类型
	public static Integer valueOf(String s)：将数字格式字符串转换成Integer

自动装箱和拆箱？
	自动装箱？
		基本数据类型 -> 引用数据类型
			int			Integer
			
		例子：
			Integer in = 12;
			/*
				Integer in = Integer.valueOf(12);
			*/
			System.out.println(in);
	
	自动拆箱？
		引用数据类型 -> 基本数据类型
		Integer    ->   int
		
		例子：
			Integer in = new Integer(12);
			int num = in + 2;
			/*
				int num = in.intValue() + 2;
			*/
			System.out.println(num);
			
	例子：
		Integer in = new Integer(12);
		in = in + 2;
		/*
			in = Integer.valueOf(in.intValue() + 2);
		*/
		System.out.println(in);//14
		
常见的考试题？
	题一：
		Integer in1 = new Integer(127);
		Integer in2 = new Integer(127);
		System.out.println(in1 == in2);//false
	
	题二：
		Integer in1 = new Integer(128);
		Integer in2 = new Integer(128);
		System.out.println(in1 == in2);//false
	
	题三：
		Integer in1 = 127;
		Integer in2 = 127;
		System.out.println(in1 == in2);//true
	
	题四：
		Integer in1 = 128;
		Integer in2 = 128;
		System.out.println(in1 == in2);//false
~~~

### System

~~~
什么是System类？
	系统工具类
		构造私有
		成员方法静态

常见的成员方法？
	public static void exit(int status)：终止当前正在运行的 Java 虚拟机
	public static long currentTimeMillis()：返回以毫秒为单位的当前时间
	public static void arraycopy(Object src,
                             int srcPos,
                             Object dest,
                             int destPos,
                             int length)：从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束
                        src - 源数组。
                        srcPos - 源数组中的起始位置。
                        dest - 目标数组。
                        destPos - 目标数据中的起始位置。
                        length - 要复制的数组元素的数量。 
~~~

### Date

~~~
什么是Date类？
	类 Date 表示特定的瞬间，精确到毫秒
	日期时间类
	
常见的构造方法？
	public Date()：分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）
	public Date(long date)：分配 Date 对象并初始化此对象，以表示自从标准基准时间，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数

常见的成员方法？
	public long getTime()：获取毫秒值
	public void setTime(long time)：设置毫秒值

解析和格式化？
	解析和格式化操作都需要额外的一个类SimpleDateFormat
	
	格式化操作？
		Date -> String
		
		Date date = new Date();
		
		//格式化操作
		//SimpleDateFormat sdf = new SimpleDateFormat();
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
		
		//格式化
		String time = sdf.format(date);
		
		System.out.println(time);//2022-07-06 17:04:11 星期三
								 //2022年07月06日 17:04:49 星期三
	
	解析操作？
		String -> Date
		
		String time = "2022年07月06日  17:05:38 星期三";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
		
		//解析
		Date date = sdf.parse(time);
		
		System.out.println(date);
		
练习题？
	你活了多少天？
		


~~~

