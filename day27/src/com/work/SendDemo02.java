package com.work;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/*
练习2：客户端数据来自键盘录入
	客户端持续键盘录入，服务器端只需要打印，不需要反馈
*/

public class SendDemo02 {
	public static void main(String[] args) throws Exception {
		//创建Socket对象
		Socket s = new Socket("10.10.10.155", 10086);
		
		//键盘录入
		Scanner sc = new Scanner(System.in);
		
		//获取管道输出流对象
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		while(true) {
			String data = sc.next();
			
			//判断何时退出
			if("886".equals(data)) {
				break;
			}
			
			//向管道中写出数据
			bw.write(data);
			//换行
			bw.newLine();
			//刷新
			bw.flush();
		}
		
		//释放资源
		s.close();
	}
}
