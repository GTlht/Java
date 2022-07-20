package com.printwriter;

import java.io.PrintWriter;

public class Demo03 {
	public static void main(String[] args) throws Exception {
		//创建打印流对象
		PrintWriter pw = new PrintWriter("b.txt");
		
		//public void println(任何数据类型 变量名)
		pw.println("约吗");
		
		//刷新
		pw.flush();
	}
}
