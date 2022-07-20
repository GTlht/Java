package com.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		//创建高效字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));
		
		//一次读取一个字符数组，一次写出一个字符数组的一部分
		char[] chs = new char[1024];
		int len = 0;
		while((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
		}
		
		//释放资源
		bw.close();
		br.close();
	}
}
