### UDP协议下数据的传输

~~~
UDP协议的特点？
	1.面向无连接
	2.传输速度相对较快
	3.相对不安全，数据容易丢失
	
UDP协议的发送端？
	实现步骤：
		//1.创建Socket对象
		DatagramSocket ds = new DatagramSocket();
		
		//2.创建数据
		String data = "约吗";
		
		//3.创建数据报包对象，将数据封装到里面
		DatagramPacket dp = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getByName("192.168.16.145"), 10086);
		
		//4.发送集装箱
		ds.send(dp);
		
		//5.释放资源(关闭Socket对象)
		ds.close();

UDP协议的接收端？
	实现步骤：
		//1.创建Socket对象
		DatagramSocket ds = new DatagramSocket(10086);
		
		//2.创建数据报包对象
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		
		//3.接收数据报包对象
		ds.receive(dp);
		
		//4.解析
		String ip = dp.getAddress().getHostAddress();
		//String data = new String(bys, 0, dp.getLength());
		String data = new String(dp.getData(), 0, dp.getLength());
		
		System.out.println(ip + "..." + data);
		
		//5.释放资源
		ds.close();

练习题？
	模拟聊天室功能？
~~~

### TCP协议下数据的传输

~~~
TCP协议的特点？
	1.面向有连接
		A计算机和B计算机之前的对话：
	
		3次握手(建立连接)：
			A 对 B 说：你瞅啥
			B 对 A 说：瞅你咋地
			A 对 B 说：来，咱俩聊聊
		
		4次挥手(断开连接)：
			A 对 B 说：咱们分手吧
			B 对 A 说：好吧
			B 对 A 说：你确定了吗？想好了吗？
			A 对 B 说：确定了，咱们不合适
	
	2.传输速度相对较慢
	3.相对安全

TCP协议的发送端？
	实现步骤：
		//1.创建Socket对象
		Socket s = new Socket("192.168.16.145", 10086);
		
		//2.创建数据
		String data = "约吗";
		
		//3.获取管道输出流对象
		OutputStream os = s.getOutputStream();
		
		//4.写出数据
		os.write(data.getBytes());
		
		//5.释放资源
		s.close();

TCP协议的接收端？
	实现步骤？
		//1.创建Socket对象
		ServerSocket ss = new ServerSocket(12306);
		
		//2.监听连接
		Socket s = ss.accept();
		
		//3.获取管道输入流对象
		InputStream is = s.getInputStream();
		
		//4.读取数据
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String data = new String(bys, 0, len);
		System.out.println(data);
		
		//5.释放资源
		s.close();
		ss.close();
~~~

