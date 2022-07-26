package txt1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*练习1：服务器给出反馈*/
public class Send1 {
	public static void main(String[] args) throws Exception {
			Socket s=new Socket("192.168.137.1", 10086);
			String data="hello!";
			OutputStream os = s.getOutputStream();
			os.write(data.getBytes());
			InputStream is = s.getInputStream();
			byte[] bys=new byte[1024];
			int len = is.read(bys);
			System.out.println(new String(bys,0,len));
			s.close();
	}

}
