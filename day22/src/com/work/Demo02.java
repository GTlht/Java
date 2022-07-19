package com.work;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo02 {
	public static void main(String[] args) throws Exception  {
		//创建普通字节输入流对象
		FileInputStream fis = new FileInputStream("a.txt");
		
		//创建普通字节输出流对象
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		//一次读取一个字节数组，一次写出一个字节数组的一部分
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}
		
		//释放资源
		fos.close();
		fis.close();
	}
}
