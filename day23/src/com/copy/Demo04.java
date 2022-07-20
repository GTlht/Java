package com.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo04 {
	public static void main(String[] args) throws Exception {
		//创建转换输入流对象
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
		
		//创建转换输出流对象
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"));
		
		//一次读取一个字符，一次写出一个字符
		int ch = 0;
		while((ch = isr.read()) != -1) {
			osw.write(ch);
		}
		
		//释放资源
		osw.close();
		isr.close();
	}
}
