package txt4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*练习4：客户端数据来自于文本文件(上传文件)*/
public class Send {
	public static void main(String[] args) throws Exception {
		Socket s=new Socket(InetAddress.getLocalHost().getHostAddress(),10086);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String data=null;
		while((data=br.readLine())!=null) {
			System.out.println(data);
			bw.write(data);
			bw.flush();
		}
		s.shutdownOutput();
		String read = br1.readLine();
		System.out.println(read);
		s.close();
		br.close();
	}

}
