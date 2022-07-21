package com.fileoutputstream;

import java.io.FileOutputStream;

public class Demo04 {
	public static void main(String[] args) throws Exception {
		//创建普通字节输出流对象
		FileOutputStream fos = new FileOutputStream("a.txt");
		
		//public void write(byte[] b,int off,int len)
		byte[] bys = {97,98,99,100,101};
		fos.write(bys, 1, 4);
	}
}
