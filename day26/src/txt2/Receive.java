package txt2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*练习2：客户端数据来自键盘录入
	客户端持续键盘录入，服务器端只需要打印，不需要反馈*/
public class Receive {
	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(10086);
		Socket s = ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line =null;
		while((line=br.readLine())!=null) {//发送端输出换行或关闭输出数据操作时接收端才能进行
			//读入操作，否则处于阻塞状态
		System.out.println(line);
	}
		ss.close();
		s.close();
	}

}
