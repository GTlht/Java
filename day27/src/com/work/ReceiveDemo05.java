package com.work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
练习5：上传文件服务器给出反馈
*/

public class ReceiveDemo05 {
	public static void main(String[] args) throws Exception {
		//创建Socket对象
		ServerSocket ss = new ServerSocket(10086);
		
		//监听连接
		Socket s = ss.accept();
		
		//获取管道输入流对象
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));
		
		//一次读取一行，一次写出一行
		String line = null;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		bw.close();
		
		//给出反馈信息
		//获取管道输出流对象
		BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		//写出数据
		bw1.write("上传成功~");
		bw1.newLine();
		bw1.flush();
		
		//释放资源
		s.close();
		ss.close();
	}
}
