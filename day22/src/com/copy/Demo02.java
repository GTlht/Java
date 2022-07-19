package com.copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		//创建高效字节输入流对象
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
		//创建高效字节输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c.txt"));
		
		//一次读取一个字节数组，一次写出一个字节数组的一部分
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}
		
		//释放资源
		bos.close();
		bis.close();
	}
}
