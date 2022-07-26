package txt4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.print.attribute.standard.Severity;

public class Receive {
	public static void main(String[] args) throws Exception{
		ServerSocket ss=new ServerSocket(10086);
		Socket s = ss.accept();
		BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String data=null;
		BufferedWriter bw1=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		while((data=br.readLine())!=null){
			System.out.println(data);
			bw.write(data);
			bw.newLine();
			bw.flush();
		}
		bw1.write("输出完成！");
		bw1.flush();
		bw1.close();
		s.close();
		ss.close();
		bw.close();
	}

}
