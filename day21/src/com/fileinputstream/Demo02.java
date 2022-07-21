package com.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		//创建普通字节输入流对象
		FileInputStream fis = new FileInputStream("a.txt");
		
		/*//public int read()
		int by = fis.read();
		System.out.println(by);//97
		
		int by1 = fis.read();
		System.out.println(by1);//98
		
		int by2 = fis.read();
		System.out.println(by2);//-1*/
		
		/*int by = fis.read();
		while(by != -1) {
			System.out.println((char)by);
			by = fis.read();
		}*/
		
		int by = 0;
		while((by = fis.read()) != -1) {
			System.out.println((char)by);
		}
		
	}
}
