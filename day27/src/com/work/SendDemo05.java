package com.work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
练习5：上传文件服务器给出反馈
*/

public class SendDemo05 {
	public static void main(String[] args) throws Exception {
		//创建Socket对象
		Socket s = new Socket("127.0.0.1", 10086);
		
		//创建高效字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		//获取管道输出流对象
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		//一次读取一行，一次写出一行
		String line = null;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//告知接收端我这边结束了
		s.shutdownOutput();
		
		//释放资源
		br.close();
		
		//接收反馈信息
		//获取管道输入流对象
		BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//读取数据
		String data = br1.readLine();
		System.out.println(data);
		
		//释放资源
		s.close();
	}
}
