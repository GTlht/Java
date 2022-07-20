package com.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo03 {
	public static void main(String[] args) throws Exception {
		//创建高效字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("d.txt"));
		
		//一次读取一行，一次写出一个字符串
		String line = null;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		
		//释放资源
		bw.close();
		br.close();
	}
}
