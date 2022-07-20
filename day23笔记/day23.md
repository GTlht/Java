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


















~~~

