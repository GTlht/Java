package com.fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03 {
	public static void main(String[] args) throws IOException {
		//创建普通字节输出流对象
		FileOutputStream fos = new FileOutputStream("a.txt");
		
		//public void write(byte[] b)
		//byte[] bys = {97,98,99,100,101};
		/*byte[] bys = {1,2,3,4,5};
		fos.write(bys);*/
		
		fos.write("abcde".getBytes());
	}
}
