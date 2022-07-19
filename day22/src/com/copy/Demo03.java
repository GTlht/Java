package com.copy;

import java.io.FileReader;
import java.io.FileWriter;

public class Demo03 {
	public static void main(String[] args) throws Exception {
		//创建普通字符输入流对象
		FileReader fr = new FileReader("a.txt");
		
		//创建普通字符输出流对象
		FileWriter fw = new FileWriter("b.txt");
		
		//一次读取一个字符，一次写出一个字符
		int ch = 0;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		
		//释放资源
		fw.close();
		fr.close();
	}
}
