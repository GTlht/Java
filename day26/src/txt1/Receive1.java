package txt1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Receive1 {
	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(10086);
		Socket s=ss.accept();
		byte[] bys=new byte[1024];
		InputStream is = s.getInputStream();
		int len=is.read(bys);
		System.out.println(new String(bys,0,len));
		OutputStream os = s.getOutputStream();
		os.write("你好呀".getBytes());
		ss.close();
		s.close();
	}

}
