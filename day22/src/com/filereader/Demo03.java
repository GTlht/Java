package com.filereader;

import java.io.FileReader;
import java.io.IOException;

public class Demo03 {
	public static void main(String[] args) throws IOException {
		//创建普通字符输入流对象
		FileReader fr = new FileReader("a.txt");
		
		/*//public int read(char[] cbuf)
		char[] chs = new char[3];
		int len = fr.read(chs);
		System.out.println(new String(chs, 0, len));*/
		
		char[] chs = new char[1024];
		int len = 0;
		while((len = fr.read(chs)) != -1) {
			System.out.println(new String(chs, 0, len));
		}
	}
}
