package com.io_exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) {
		//创建普通字节输入流对象
		FileInputStream fis = null;
		//创建普通字节输出流对象
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("a.txt");
			fos = new FileOutputStream("c.txt");
			
			//一次读取一个字节数组，一次写出一个字节数组的一部分
			byte[] bys = new byte[5];
			int len = 0;
			while((len = fis.read(bys)) != -1) {
				fos.write(bys, 0, len);
			}
		} catch(Exception e) {
			e.printStackTrace();//打印异常信息
		} finally {
			//非空校验
			if(fos != null) {
				//释放资源
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			//非空校验
			if(fis != null) {
				//释放资源
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
