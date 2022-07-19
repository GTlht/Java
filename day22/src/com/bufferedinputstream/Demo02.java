package com.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		//创建高效字节输入流对象
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
		
		//一次读取一个字节数据
		int by = bis.read();
		System.out.println(by);
	}
}
