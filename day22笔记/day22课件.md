### BufferedOutputStream

~~~
什么是BufferedOutputStream？
	高效字节输出流
	缓冲字节输出流(自带一个缓冲区)
	效率高

常见的构造方法？
	public BufferedOutputStream(OutputStream out)：创建一个新的缓冲输出流，以将数据写入指定的底层输出流

常见的成员方法？
	和FileOutputStream中的方法是一样的
	
	public void flush()：刷新此缓冲的输出流，这迫使所有缓冲的输出字节被写出到底层输出流中
		flush()和close()的区别？
			flush()就是刷新，可以重复使用
			close()是释放资源的，只不过在释放资源之前会自动的刷新一次，只能使用一次
~~~

### BufferedInputStream

~~~
什么是BufferedInputStream？
	高效字节输入流
	缓冲字节输入流
	效率高
	
常见的构造方法？
	public BufferedInputStream(InputStream in)：创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用

常见的成员方法？
	和FileInputStream的方法是一样的
~~~

### 文件复制

~~~
方式一：一次读取一个字节，一次写出一个字节
	//创建高效字节输入流对象
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
    //创建高效字节输出流对象
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.txt"));

    //一次读取一个字节，一次写出一个字节
    int by = 0;
    while((by = bis.read()) != -1) {
    	bos.write(by);
    }

    //释放资源
    bos.close();
    bis.close();
    
方式二：一次读取一个字节数组，一次写出一个字节数组的一部分
	//创建高效字节输入流对象
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
    //创建高效字节输出流对象
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c.txt"));

    //一次读取一个字节数组，一次写出一个字节数组的一部分
    byte[] bys = new byte[1024];
    int len = 0;
    while((len = bis.read(bys)) != -1) {
    	bos.write(bys, 0, len);
    }

    //释放资源
    bos.close();
    bis.close();
~~~

### 装饰设计模式

~~~
应用场景：
	当我们想要给某个类中的某些方法功能进行增强的时候，就可以使用装饰设计模式

当我们想要对某个类中的某些方法的功能进行增强的时候，选择方案有三种：
	1.继承
	2.装饰设计模式
	3.动态代理设计模式

案例？
	1.
		public class Demo02 {
            public static void main(String[] args) {
                Tony tony = new Tony();
                tony.eat();
                tony.sleep();
                tony.drink();
                tony.run();
                tony.jump();

                System.out.println("---------------------------");

                Ironman ironman = new Ironman(tony);
                ironman.eat();
                ironman.sleep();
                ironman.drink();
                ironman.run();
                ironman.jump();
            }
        }

        abstract class Person {
            public abstract void eat();

            public abstract void drink();

            public abstract void sleep();

            public abstract void run();

            public abstract void jump();
        }

        class Tony extends Person {
            @Override
            public void eat() {
                System.out.println("吃肉");
            }

            @Override
            public void drink() {
                System.out.println("喝牛奶");
            }

            @Override
            public void sleep() {
                System.out.println("睡觉");
            }

            @Override
            public void run() {
                System.out.println("正常跑");
            }

            @Override
            public void jump() {
                System.out.println("正常跳");
            }
        }

        class Ironman extends Person {
            private Person person;

            public Ironman(Person person) {
                this.person = person;
            }

            @Override
            public void eat() {//功能没有增强
                person.eat();
            }

            @Override
            public void drink() {//功能没有增强
                person.drink();
            }

            @Override
            public void sleep() {//功能没有增强
                person.sleep();
            }

            @Override
            public void run() {//功能增强
                System.out.println("超级跑");
            }

            @Override
            public void jump() {//功能增强
                System.out.println("超级跳");
            }
        } 

	2.
		public class Demo03 {
            public static void main(String[] args) {
                FileInputStream fis = new FileInputStream();

                //一次读取一个字节
                int by = fis.read();
                //一次读取一个字节数组
                byte[] bys = new byte[1024];
                int len = fis.read(bys);

                fis.close();

                System.out.println("-----------------------------------");

                BufferedInputStream bis = new BufferedInputStream(new FileInputStream());

                //一次读取一个字节
                int b = bis.read();
                //一次读取一个字节数组
                byte[] bys1 = new byte[1024];
                int len1 = bis.read(bys1);

                bis.close();
            }
        }

        abstract class InputStream {
            public abstract int read();
            public abstract int read(byte[] bys);
            public abstract void close();
            public abstract void aaa();
            public abstract void bbb();
            public abstract void ccc();
        }

        class FileInputStream extends InputStream {
            @Override
            public int read() {
                //一次读取一个字节
                return 0;
            }

            @Override
            public int read(byte[] bys) {
                //一次读取一个字节数组
                return 0;
            }

            @Override
            public void close() {
                //释放资源
            }

            @Override
            public void aaa() {
                //各种杂七杂八的功能
            }

            @Override
            public void bbb() {
                //各种杂七杂八的功能
            }

            @Override
            public void ccc() {
                //各种杂七杂八的功能
            }
        }

        class BufferedInputStream extends InputStream {
            private InputStream is; 

            public BufferedInputStream(InputStream is) {
                this.is = is;
            }

            @Override
            public int read() {//功能需要增强
                //一次读取一个字节增强版
                return 0;
            }

            @Override
            public int read(byte[] bys) {//功能需要增强
                //一次读取一个字节数组增强版
                return 0;
            }

            @Override
            public void close() {//功能不需要增强
                is.close();
            }

            @Override
            public void aaa() {//功能不需要增强
                is.aaa();
            }

            @Override
            public void bbb() {//功能不需要增强
                is.bbb();
            }

            @Override
            public void ccc() {//功能不需要增强
                is.ccc();
            }
        }
~~~

### 字符流

~~~
为什么要有字符流？
	因为在有些情况使用字节流是无法完成的
	比如说当我们对文件中的中文数据进行读取操作的时候，就会出现问题
	
	字符流 = 字节流 + 编码表

编码表？
	ASCII：是所有编码表中最最基础的编码表，任何编码表都囊括了ASCII编码表，里面的内容少，只有26个大小写英文字母，数字，和一些标点符号组成
	
	GBK：是本国编码表，共收录21003个汉字，一个中文汉字占2个字节，里面囊括了ASCII
	
	Unicode：统一码（Unicode），也叫万国码、单一码，是计算机科学领域里的一项业界标准，包括字符集、编码方案等。Unicode是为了解决传统的字符编码方案的局限而产生的，它为每种语言中的每个字符设定了统一并且唯一的二进制编码，以满足跨语言、跨平台进行文本转换、处理的要求。
	*UTF-8：一个中文占了3个字节
	UTF-16：一个中文占了2个字节
	UTF-32：一个中文占了4个字节
	
字符串的编码和解码？
	编码：
        什么是编码？
            字符串变成字节数据
	
		怎么实现编码操作？
			public byte[] getBytes()：使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
			public byte[] getBytes(String charsetName)：使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
			
	解码：
		什么是解码？
			字节数据变成字符串
			
		怎么实现解码操作？
			public String(byte[] bytes)：通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String
			public String(byte[] bytes,String charsetName)：通过使用指定的 charset 解码指定的 byte 数组，构造一个新的 String
~~~

### FileWriter

~~~
常见的构造方法？
	public FileWriter(File file)： 根据给定的 File 对象构造一个 FileWriter 对象
	public FileWriter(File file,boolean append)：  根据给定的 File 对象构造一个 FileWriter 对象，可以追加
	public FileWriter(String fileName)：根据给定的文件名构造一个 FileWriter 对象
	public FileWriter(String fileName,boolean append)根据给定的文件名构造一个 FileWriter 对象，可以追加

常见的成员方法？
	public void write(int c)：写出字符数据
	public void write(char[] cbuf)：写出字符数组数据
	public abstract void write(char[] cbuf,int off,int len)：写出字符数组的一部分数据
	public void write(String str)：写出一个字符串数据
	public void write(String str,int off,int len)：写出一个字符串的一部分的数据
~~~

### FileReader

~~~
常见的构造方法？
	public FileReader(File file)：在给定从中读取数据的 File 的情况下创建一个新 FileReader
	public FileReader(String fileName)：在给定从中读取数据的文件名的情况下创建一个新 FileReader
	
常见的成员方法？
	public int read()：读取一个字符数据
	public int read(char[] cbuf)：读取一个字符数组的数据
~~~

### 文件复制

~~~
方式一：一次读取一个字符，一次写出一个字符
	//创建普通字符输入流对象
    FileReader fr = new FileReader("a.txt");

    //创建普通字符输出流对象
    FileWriter fw = new FileWriter("b.txt");

    //一次读取一个字符，一次写出一个字符
    int ch = 0;
    while((ch = fr.read()) != -1) {
    	fw.write(ch);
    }

    //释放资源
    fw.close();
    fr.close();

方式二：一次读取一个字符数组，一次写出一个字符数组的一部分
	//创建普通字符输入流对象
    FileReader fr = new FileReader("a.txt");

    //创建普通字符输出流对象
    FileWriter fw = new FileWriter("c.txt");

    //一次读取一个字符数组，一次写出一个字符数组的一部分
    char[] chs = new char[1024];
    int len = 0;
    while((len = fr.read(chs)) != -1) {
   		fw.write(chs, 0, len);
    }

    //释放资源
    fw.close();
    fr.close();
~~~

### BufferedWriter

~~~
常见的构造方法？
	public BufferedWriter(Writer out)：创建一个使用默认大小输出缓冲区的缓冲字符输出流
	
常见的成员方法？
	和FileWriter中的方法是一样

	特有方法：
		public void newLine()：写入一个行分隔符，会根据操作系统来自动改变换行符
~~~

### BufferedReader

~~~
常见的构造方法？
	public BufferedReader(Reader in)：创建一个使用默认大小输入缓冲区的缓冲字符输入流
	
常见的成员方法？
	和FileReader中的方法是一样的
	
	特有方法：
		public String readLine()：读取一个文本行，读取一行，一个字符串
~~~

