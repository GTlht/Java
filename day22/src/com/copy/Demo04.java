package com.copy;

import java.io.FileReader;
import java.io.FileWriter;

public class Demo04 {
	public static void main(String[] args) throws Exception {
		//创建普通字符输入流对象
		FileReader fr = new FileReader("a.txt");
		
		//创建普通字符输出流对象
		FileWriter fw = new FileWriter("c.txt");
		
		//一次读取一个字符数组，一次写出一个字符数组的一部分
		char[] chs = new char[1024];
		int len = 0;
		while((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}
		
		//释放资源
		fw.close();
		fr.close();
		
	}
}
