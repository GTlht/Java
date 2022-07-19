package com.bufferedoutputstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//创建高效字节输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a.txt"));
		//FileOutputStream fos = new FileOutputStream("b.txt");
		
		//一次写出一个字节数据
		bos.write('a');
		//fos.write('a');
		
		//刷新
		//bos.flush();
		bos.close();
	}
}
