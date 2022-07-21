package com.fileoutputstream;

import java.io.FileOutputStream;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		//创建普通字节输出流对象
		FileOutputStream fos = new FileOutputStream("a.txt");
		
		//public void write(int b)
		//fos.write(97);
		//fos.write(123);
		
		fos.write(97);
		fos.write(98);
		fos.write(99);
		fos.write('a');
	}
}
