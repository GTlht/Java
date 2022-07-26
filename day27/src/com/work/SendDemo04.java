package com.work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
练习4：客户端数据来自于文本文件(上传文件)
*/

public class SendDemo04 {
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
		
		//释放资源
		br.close();
		s.close();
	}
}
