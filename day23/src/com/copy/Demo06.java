package com.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo06 {
	public static void main(String[] args) throws Exception {
		//创建高效转换输入流对象
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
		
		//创建高效转换输出流对象
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d.txt")));		
		
		//一次读取一个字符，一次写出一个字符
		int ch = 0;
		while((ch = br.read()) != -1) {
			bw.write(ch);
		}
		
		//释放资源
		bw.close();
		br.close();
	}
}
