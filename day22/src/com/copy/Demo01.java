package com.copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//创建高效字节输入流对象
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
		//创建高效字节输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.txt"));
		
		//一次读取一个字节，一次写出一个字节
		int by = 0;
		while((by = bis.read()) != -1) {
			bos.write(by);
		}
		
		//释放资源
		bos.close();
		bis.close();
	}
}
