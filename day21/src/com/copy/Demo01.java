package com.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//创建普通字节输入流对象
		FileInputStream fis = new FileInputStream("a.txt");
		
		//创建普通字节输出流对象
		FileOutputStream fos = new FileOutputStream("b.txt");
		
		//一次读取一个字节，一次写出一个字节
		int by = 0;
		while((by = fis.read()) != -1) {
			fos.write(by);
		}
		
		//释放资源
		fos.close();
		fis.close();
	}
}
