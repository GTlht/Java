package com.fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo05 {
	public static void main(String[] args) throws IOException {
		//public FileOutputStream(String name, boolean append)
		FileOutputStream fos = new FileOutputStream("b.txt", true);
		
		//写出一个字节数据
		fos.write('a');
		fos.write('b');
		
		
	}
}
