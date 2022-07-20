package com.printwriter;

import java.io.PrintWriter;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		//创建打印流对象
		PrintWriter pw = new PrintWriter("a.txt");
		
		//一次写出一个字符串
		pw.write("约吗");
		
		//刷新
		pw.flush();
	}
}
