package txt2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Send {
	public static void main(String[] args) throws IOException {
		Socket s=new Socket(InetAddress.getLocalHost().getHostAddress(),10086);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		while(true) {
		Scanner sc=new Scanner(System.in);
		String data=sc.next();
		
		bw.write(data);
		//s.shutdownInput();不得行，换行好使，会彻底关闭输出数据操作
		//bw.newLine();
		bw.flush();
		if(data.equals("886")) {
			break;
		}
		}
		s.close();
	}
	

}
