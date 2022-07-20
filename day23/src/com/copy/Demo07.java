package com.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo07 {
	public static void main(String[] args) throws Exception {
		//创建高效转换输入流对象
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
		
		//创建高效转换输出流对象
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("e.txt")));		
		
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
