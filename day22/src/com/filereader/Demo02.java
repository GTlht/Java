package com.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		//创建普通字符输入流对象
		FileReader fr = new FileReader("a.txt");
		
		/*//public int read()
		int ch = fr.read();
		System.out.println((char)ch);
		
		int ch1 = fr.read();
		System.out.println((char)ch1);
		
		int ch2 = fr.read();
		System.out.println(ch2);*/
		
		int ch = 0;
		while((ch = fr.read()) != -1) {
			System.out.println((char)ch);
		}
	}
}
