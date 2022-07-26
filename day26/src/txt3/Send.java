package txt3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Send {
	public static void main(String[] args) throws Exception {
		Socket s=new Socket(InetAddress.getLocalHost().getHostAddress(),10086);
		Scanner sc=new Scanner(System.in);
		String data=null;
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		while(true) {
			data=sc.next();
			bw.write(data);
			//bw.newLine();
			bw.flush();
			if(data.equals("886")) {
				break;
			}
		}
		s.close();
	}

}
