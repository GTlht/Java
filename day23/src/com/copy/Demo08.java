package com.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo08 {
	public static void main(String[] args) throws Exception {
		//创建高效转换输入流对象
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
		
		//创建高效转换输出流对象
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("f.txt")));		
		
		//一次读取一行，一次写出一行
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
