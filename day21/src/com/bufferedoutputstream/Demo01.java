package com.bufferedoutputstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		//public BufferedOutputStream(OutputStream out)
		/*FileOutputStream fos = new FileOutputStream("a.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		System.out.println(bos);*/
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a.txt"));
		//装饰设计模式(包装设计模式)
	}
}
