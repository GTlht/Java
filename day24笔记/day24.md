### 文件复制

~~~
方式一：一次读取一个字符，一次写出一个字符
	//创建高效字符输入流对象
    BufferedReader br = new BufferedReader(new FileReader("a.txt"));

    //创建高效字符输出流对象
    BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

    //一次读取一个字符，一次写出一个字符
    int ch = 0;
    while((ch = br.read()) != -1) {
    	bw.write(ch);
    }

    //释放资源
    bw.close();
    br.close();
    
方式二：一次读取一个字符数组，一次写出一个字符数组的一部分
	//创建高效字符输入流对象
    BufferedReader br = new BufferedReader(new FileReader("a.txt"));

    //创建高效字符输出流对象
    BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));

    //一次读取一个字符数组，一次写出一个字符数组的一部分
    char[] chs = new char[1024];
    int len = 0;
    while((len = br.read(chs)) != -1) {
    	bw.write(chs, 0, len);
    }

    //释放资源
    bw.close();
    br.close();

方式三：一次读取一行，一次写出一行
	//创建高效字符输入流对象
    BufferedReader br = new BufferedReader(new FileReader("a.txt"));

    //创建高效字符输出流对象
    BufferedWriter bw = new BufferedWriter(new FileWriter("d.txt"));

    //一次读取一行，一次写出一个字符串
    String line = null;
    while((line = br.readLine()) != null) {
    	bw.write(line);
    	bw.newLine();
    }

    //释放资源
    bw.close();
    br.close();
~~~

### 转换流

~~~
什么是转换流？
	可以将字节流转换成字符流的流就称为转换流

OutputStreamWriter？
	转换输出流
	
	常见的构造方法？
		public OutputStreamWriter(OutputStream out)：创建使用默认字符编码的 OutputStreamWriter
		public OutputStreamWriter(OutputStream out, String charsetName)：创建使用指定字符集的 OutputStreamWriter
	
	常见的成员方法？
		和FileWriter的方法是一样的

InputStreamReader？
	转换输入流
	
	常见的构造方法？
		public InputStreamReader(InputStream in)：创建一个使用默认字符集的 InputStreamReader
		public InputStreamReader(InputStream in,String charsetName)：创建使用指定字符集的 InputStreamReader
		
	常见的成员方法？
		和FileReader中的方法是一样的
~~~

### 文件复制

~~~
方式一：一次读取一个字符，一次写出一个字符
	//创建转换输入流对象
    InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));

    //创建转换输出流对象
    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"));

    //一次读取一个字符，一次写出一个字符
    int ch = 0;
    while((ch = isr.read()) != -1) {
    	osw.write(ch);
    }

    //释放资源
    osw.close();
    isr.close();

方式二：一次读取一个字符数组，一次写出一个字符数组的一部分
	//创建转换输入流对象
    InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));

    //创建转换输出流对象
    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("c.txt"));

    //一次读取一个字符数组，一次写出一个字符数组的一部分
    char[] chs = new char[1024];
    int len = 0;
    while((len = isr.read(chs)) != -1) {
    	osw.write(chs, 0, len);
    }

    //释放资源
    osw.close();
    isr.close();

方式三：一次读取一个字符，一次写出一个字符
	//创建高效转换输入流对象
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));

	//创建高效转换输出流对象
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new
FileOutputStream("d.txt")));		

    //一次读取一个字符，一次写出一个字符
    int ch = 0;
    while((ch = br.read()) != -1) {
    	bw.write(ch);
    }

    //释放资源
    bw.close();
    br.close();
    
方式四：一次读取一个字符数组，一次写出一个字符数组的一部分
	//创建高效转换输入流对象
	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
		
	//创建高效转换输出流对象
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("e.txt")));		

    //一次读取一个字符数组，一次写出一个字符数组的一部分
    char[] chs = new char[1024];
    int len = 0;
    while((len = br.read(chs)) != -1) {
    	bw.write(chs, 0, len);
    }

    //释放资源
    bw.close();
    br.close();

方式五：一次读取一行，一次写出一行
	//创建高效转换输入流对象
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));

    //创建高效转换输出流对象
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("f.txt")));		

    //一次读取一行，一次写出一行
    String line = null;
    while((line = br.readLine()) != null) {
    	bw.write(line);
    	bw.newLine();
    }

    //释放资源
    bw.close();
    br.close();
~~~

### 打印流

~~~
什么是打印流？
	打印流就是输出流
	PrintWriter
	PrintStream
	
PrintWriter？
	常见的构造方法？
		public PrintWriter(String fileName)：创建具有指定文件名称且不带自动行刷新的新 PrintWriter
		public PrintWriter(Writer out,boolean autoFlush)：创建新 PrintWriter
			两个前提条件：
				1.autoFlush为true
				2.调用println、printf 或 format 方法
	
	常见的成员方法？
		write()和FileWriter()是一样的

		特有的方法：
			public void println(任何数据类型 变量名)
			
		write()和println()的区别？
			1.println()自带换行，write()不带换行
			2.println()的形参可以是任意类型的数据，什么都输出到文件中，
			  write()的形参只能是几种数据类型的数据
			3.println()可以开启自动刷新，write()不可以开启自动刷新
~~~

### 文件复制

~~~
方式一：一次读取一行，一次打印一行
	//创建高效字符输入流对象
    BufferedReader br = new BufferedReader(new FileReader("a.txt"));

    //创建打印流对象
    PrintWriter pw = new PrintWriter("b.txt");

    //一次读取一行，一次打印一行
    String line = null;
    while((line = br.readLine()) != null) {
    	pw.println(line);
    }

    //释放资源
    pw.close();
    br.close();

方式二：一次读取一行，一次打印一行(开启自动刷新)
	//创建高效字符输入流对象
    BufferedReader br = new BufferedReader(new FileReader("a.txt"));

    //创建打印流对象
    PrintWriter pw = new PrintWriter(new FileWriter("c.txt"), true);

    //一次读取一行，一次打印一行
    String line = null;
    while((line = br.readLine()) != null) {
    	pw.println(line);
    }

    //释放资源
    /*br.close();
    pw.close();*/
~~~

### 对象操作流(序列化流和反序列化流)

~~~
什么是对象操作流？
	专门用来读写对象的流
	ObjectOutputStream 序列化流
	ObjectInputStream 反序列化
	
	什么是序列化？
		是指将对象从内存中以流的形式写出到文本磁盘
		
	什么是反序列化？
		是指将本地磁盘中的数据还原成内存中的对象
	
	注意：想要实现对象被序列化操作和反序列化操作，要去该对象的类必须实现序列化接口Serializable
		
ObjectOutputStream？
	常见的构造方法？
		public ObjectOutputStream(OutputStream out)：创建写入指定 OutputStream 的 ObjectOutputStream
		
	常见的成员方法？
		public final void writeObject(Object obj)：将指定的对象写入 ObjectOutputStream

ObjectInputStream？
	常见的构造方法？
		public ObjectInputStream(InputStream in)：创建从指定 InputStream 读取的 ObjectInputStream

	常见的成员方法？
		public final Object readObject()：从 ObjectInputStream 读取对象
~~~

### 到底该用哪些流

~~~
如果操作的文件打开我们能看得懂，建议使用字符流
	比如说：
		.txt
		.java
		文本文档

如果操作的文件打开我们看不懂，建议使用字节流
	比如说：
		.mp3
		.mp4
		.jpg
		.png
		.gif
		.......
		
如果一些文件我们也不知道能不能看得懂，建议使用字节流，因为字节流也是万能流
	
字符流：
	BufferedReader + BufferedWriter：
		一次读取一个字符数组，一次写出一个字符数组的一部分
		一次读取一行，一次写出一行
	BufferedReader + PrintWriter：一次读取一行，一次写出一行
	
字节流：
	BufferedInputStream + BufferedOutputStream：一次读取一个字节数组，一次写出一个字节数组的一部分
~~~

### Properties

~~~
什么是Properties？
	双列集合
	Properties 类表示了一个持久的属性集
	Properties 可保存在流中或从流中加载
	属性列表中每个键及其对应值都是一个字符串
	
常见的构造方法？
	public Properties()：创建一个无默认值的空属性列表
	
常见的成员方法？
	和Map是一样的
	
	特有的方法：
		*public Object setProperty(String key,String value)：相当于put()
		*public String getProperty(String key)：相当于get()
		public Set<String> stringPropertyNames()：相当于keySet()
		
		public void store(OutputStream out,String comments)：保存
		**public void load(InputStream inStream)：加载

Properties的作用是什么？
	用来加载配置文件的
	这种配置文件的后缀名叫做.properties
~~~

### 类加载器

~~~
什么是类加载器？
	能够将.class文件加载进内存的东西就称为类加载器
	
类加载器的作用？
	将本地磁盘中的.class文件加载到内存中的方法区中形成字节码文件对象

类加载器的分类？
	引导类加载器：负责加载的区域是jdk中的jre中的lib中rt.jar中的资源文件
	扩展类加载器(ExtClassLoader)：负责加载的区域是jdk中的jre中lib中ext中资源文件
	系统类加载器(AppClassLoader)：负责加载的区域是classpath路径下的资源文件
		classpath路径是什么？
			就是.class文件存放的路径
			eclipse的默认存放路径是bin目下

类加载器的分层关系？
	最上层：引导类加载器
	中间层：扩展类加载器
	最下层：系统类加载器
	
类的加载顺序？
	在java中一种机制，委托机制
	
	当我们要加载一个.class文件进内存的时候，都是先由最下层，既系统类加载器来加载，但是由于委托机制，系统类加载器会先委托给上一层类加载器来加载，既扩展类加载器来加载。由于委托机制，扩展类加载器会委托给上一层类加载器来加载，既引导类加载器来加载。由于引导类加载器已经是最上一层，没有上一层，只能自己去自己所管辖的片区去找有没有该类，有就加载，没有就扔给下一层类加载器来加载，既扩展类加载器来加载，扩展类加载器会在自己所管辖的片区查找有没有该类，有就加载，没有就扔给下一层类加载器来加载，既系统类加载器来加载，系统类加载器会在自己所管辖的片区查找有没有该类，有就加载，没有就会报错，提示类找不到异常。
	
	练习题？
		class Person {}
		
		class Demo {
			public static void main(String[] args) {
				Person p = new Person();
				String s = new String();
			} 
		}
		
		Person类是由哪个类加载器来加载的？
			系统类加载器来加载的
			
		String类是由哪个类加载器来加载的？
			引导类加载器来加载的

引导类加载器，扩展类加载器和系统类加载器，它们负责加载其他的类，那谁来负责加载它们呢？
	扩展类加载器和系统类加载器都是由引导类加载器来加载的
	引导类加载器不是一个对象，它是JVM的一部分，是由C语言编写的

类加载器的相关方法？
	1.如何获取类加载器对象？
		a.获取类的字节码文件对象
			Class clazz = Person.class;
		b.通过类的字节码文件对象获取类加载器对象
			ClassLoader classLoader = clazz.getClassLoader();
	
	2.类加载器常见的成员方法？
		public final ClassLoader getParent()：返回委托的父类加载器
		public InputStream getResourceAsStream(String name)：返回读取指定资源的输入流
		public URL getResource(String name)：查找具有给定名称的资源
			URL类：
				public String getPath()：获取此 URL 的路径部分
~~~

### 五子棋

~~~
单机版：
	画棋盘
	落子
	判断胜负
	
	开新局(再来一局) 我讲
	悔棋 自己写
	退出 自己写(我讲一半)
	保存棋谱 我讲
	*打谱(复盘) 自己写
	


网络版：








~~~

