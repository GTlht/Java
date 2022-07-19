package com.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		//创建高效字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		//一次读取一个字符
		/*int ch = br.read();
		System.out.println((char)ch);*/
		
		int ch = 0;
		while((ch = br.read()) != -1) {
			System.out.println((char)ch);
		}
	}
}
