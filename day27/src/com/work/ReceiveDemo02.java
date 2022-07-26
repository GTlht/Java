package com.work;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
练习2：客户端数据来自键盘录入
	客户端持续键盘录入，服务器端只需要打印，不需要反馈
*/
public class ReceiveDemo02 {
	public static void main(String[] args) throws Exception {
		//创建Socket对象
		ServerSocket ss = new ServerSocket(10086);
		
		//监听连接
		Socket s = ss.accept();
		
		//获取管道输入流对象
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//从管道中读取数据
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		//释放资源
		s.close();
		ss.close();
	}
}
