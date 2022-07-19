### IO流

~~~
我们为什么要学习IO流？
	当我们写程序的时候，操作的数据比较多了，这个时候一般我们会选择使用容器，将数据存储起来，方便对数据进行管理和操作，那我们就会选择使用数组容器或者集合容器。
	但是数组容器和集合容器有一个弊端，它们只要在程序启动的时候，可以存储数据，当程序停止的时候，内存释放，数据丢失。不能够实现数据的永久性(持久性)存储
	想要实现数据的持久性存储，怎么办？
		使用IO流
	
学习IO的目的？
	1.能够实现将数据从内存写出到本地磁盘
	2.能够实现将数据从本地磁盘读取到内存
	
什么是IO流？
		I：Input，输入
		O：Ouput，输出
		流：是指数据在传输的时候像水流一样，水流，电流
		
IO流的分类？
	1.按照类型分
		a.字节流
		b.字符流
	2.按照流向分
		a.输入流
		b.输出流
	
	我们对IO流的称呼？
		1.字节输入流
		2.字节输出流
		3.字符输入流
		4.字符输出流
		
IO流的体系结构？
	OutputStream 字节输出流的顶层抽象类
		-- *FileOutputStream 普通字节输出流
		-- *ObjectOutputStream 对象操作输出流(序列化流)
		-- FilterOutputStream
			-- *BufferedOutputStream 高效字节输出流
			-- *PrintStream 字节打印流
	
	InputStream 字节输入流的顶层抽象类
		-- *FileInputStream 普通字节输入流
		-- *ObjectInputStream 对象操作输入流(反序列化流)
		-- FilterInputStream
			-- *BufferedInputStream 高效字节输入流
			
	Writer 字符输出流的顶层抽象类
		-- *BufferedWriter 高效字符输出流
		-- *OutputStreamWriter 转换输出流
			-- *FileWriter 普通字符输出流
		-- *PrintWriter 字符打印流
		
	Reader 字符输入流的顶层抽象类
		-- *BufferedReader 高效字符输入流
		-- *InputStreamReader 转换输入流
			-- *FileReader 普通字符输入流
~~~

### FileOutputStream

~~~
常见的构造方法？
	public FileOutputStream(File file)：创建一个向指定 File 对象表示的文件中写入数据的文件输出流
	public FileOutputStream(File file, boolean append)：创建一个向指定 File 对象表示的文件中写入数据的文件输出流。如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处
	public FileOutputStream(String name)： 创建一个向具有指定名称的文件中写入数据的输出文件流
	public FileOutputStream(String name, boolean append)：创建一个向指定 File 对象表示的文件中写入数据的文件输出流。如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处
	
	注意：如果文件不存在，会给我们创建出一个文件，如果文件存在并且有内容，会清空

常见的成员方法？
	public void write(int b)：写出一个字节数据
	public void write(byte[] b)：写出一个字节数组的数据
	public void write(byte[] b,int off,int len)：写出一个字节数组中的一部分的数据

	思考两个小问题？
		问题一：如何实现追加？
			public FileOutputStream(File file, boolean append)
			public FileOutputStream(String name, boolean append)
			
			第二个参数传递true
			
		问题二：如何实现换行？
			使用换行符
			
			1.windows \r\n
			2.linux \n
			3.mac \r
~~~

### FileInputStream

~~~
常见的构造方法？
	public FileInputStream(File file)：通过打开一个到实际文件的连接来创建一个 FileInputStream
	public FileInputStream(String name)：通过打开一个到实际文件的连接来创建一个 FileInputStream

	注意：读取的不能是文件夹，要是文件，而且这个文件还必须存在，要不然会报错
	
常见的成员方法？
	public int read()：读取一个字节数据，读取不到返回-1
	public int read(byte[] b)：读取一个字节数组的数据，返回实际读取的个数，如果读取不到了则返回-1
~~~

### 复制文件

~~~
方式一：一次读取一个字节，一次写出一个字节
	//创建普通字节输入流对象
    FileInputStream fis = new FileInputStream("a.txt");

    //创建普通字节输出流对象
    FileOutputStream fos = new FileOutputStream("b.txt");

    //一次读取一个字节，一次写出一个字节
    int by = 0;
    while((by = fis.read()) != -1) {
    	fos.write(by);
    }

    //释放资源
    fos.close();
    fis.close();

方式二：一次读取一个字节数组，一次写出一个字节数组的一部分
	//创建普通字节输入流对象
    FileInputStream fis = new FileInputStream("a.txt");
    //创建普通字节输出流对象
    FileOutputStream fos = new FileOutputStream("c.txt");

    //一次读取一个字节数组，一次写出一个字节数组的一部分
    byte[] bys = new byte[5];
    int len = 0;
    while((len = fis.read(bys)) != -1) {
        fos.write(bys, 0, len);
    }

    //释放资源
    fos.close();
    fis.close();
~~~

### IO流的异常处理

~~~
//创建普通字节输入流对象
FileInputStream fis = null;
//创建普通字节输出流对象
FileOutputStream fos = null;

try {
    fis = new FileInputStream("a.txt");
    fos = new FileOutputStream("c.txt");

    //一次读取一个字节数组，一次写出一个字节数组的一部分
    byte[] bys = new byte[5];
    int len = 0;
    while((len = fis.read(bys)) != -1) {
    	fos.write(bys, 0, len);
	}
} catch(Exception e) {
	e.printStackTrace();//打印异常信息
} finally {
    //非空校验
    if(fos != null) {
    	//释放资源
        try {
        	fos.close();
        } catch (IOException e) {
        	e.printStackTrace();
        }
    }

    //非空校验
    if(fis != null) {
    	//释放资源
        try {
        	fis.close();
        } catch (IOException e) {
        	e.printStackTrace();
        }
	}
}
~~~

### BufferedOutputStream

~~~
什么是BufferedOutputStream？
	高效字节输出流
	缓冲字节输出流(自带一个缓冲区)
	效率高

常见的构造方法？
	public BufferedOutputStream(OutputStream out)：创建一个新的缓冲输出流，以将数据写入指定的底层输出流

常见的成员方法？

~~~

