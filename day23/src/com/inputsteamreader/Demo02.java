package com.inputsteamreader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		//创建转换输入流对象
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
		
		//public InputStreamReader(InputStream in)
		/*int ch = isr.read();
		System.out.println((char)ch);*/
		
		int ch = 0;
		while((ch = isr.read()) != -1) {
			System.out.println((char)ch);
		}
	}
}
