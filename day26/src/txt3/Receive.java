package txt3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Receive {
	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(10086);
		Socket s = ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));
		String data=null;
		while(true) {
			data=br.readLine();
			if(data==null) {
				break;
			}
			bw.write(data);
			bw.newLine();
			bw.flush();
			System.out.println(data);
			
		}
		s.close();
		ss.close();
		bw.close();
	}

}
