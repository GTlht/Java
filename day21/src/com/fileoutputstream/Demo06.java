package com.fileoutputstream;

import java.io.FileOutputStream;

public class Demo06 {
	public static void main(String[] args) throws Exception {
		//创建普通字节输出流对象
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		//写出一个字节数据
		fos.write('a');
		fos.write('b');
		fos.write('c');
		//fos.write("\r\n".getBytes());
		fos.write('\n');
		fos.write('d');
		fos.write('e');
	}
}
