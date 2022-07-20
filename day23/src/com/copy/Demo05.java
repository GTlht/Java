package com.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo05 {
	public static void main(String[] args) throws Exception {
		//创建转换输入流对象
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
		
		//创建转换输出流对象
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("c.txt"));
		
		//一次读取一个字符数组，一次写出一个字符数组的一部分
		char[] chs = new char[1024];
		int len = 0;
		while((len = isr.read(chs)) != -1) {
			osw.write(chs, 0, len);
		}
		
		//释放资源
		osw.close();
		isr.close();
	}
}











