package com.string;

import java.io.FileInputStream;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//创建普通字节输入流对象
		FileInputStream fis = new FileInputStream("a.txt");
		
		/*//一次读取一个字节数据
		int by = fis.read();
		System.out.println((char)by);
		
		int by1 = fis.read();
		System.out.println((char)by1);
		
		int by2 = fis.read();
		System.out.println((char)by2);
		
		int by3 = fis.read();
		System.out.println((char)by3);
		
		int by4 = fis.read();
		System.out.println((char)by4);
		
		int by5 = fis.read();
		System.out.println((char)by5);
		
		int by6 = fis.read();
		System.out.println((char)by6);
		
		int by7 = fis.read();
		System.out.println(by7);*/
		
		//一次读取一个字节数组
		byte[] bys = new byte[5];
		int len = fis.read(bys);
		System.out.println(new String(bys, 0, len));
	}
}
