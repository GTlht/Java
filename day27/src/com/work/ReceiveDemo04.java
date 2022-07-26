package com.work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
练习4：客户端数据来自于文本文件(上传文件)
*/

public class ReceiveDemo04 {
	public static void main(String[] args) throws Exception {
		//创建Socket对象
		ServerSocket ss = new ServerSocket(10086);
		
		//监听连接
		Socket s = ss.accept();
		
		//获取管道输入流对象
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		
		//一次读取一行，一次写出一行
		String line = null;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		//bw.close();
		s.close();
		ss.close();
	}
}
