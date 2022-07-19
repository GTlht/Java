package com.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//2.拷贝指定图片到项目文件夹下，文件名保持一致。
public class Demo03 {
	public static void main(String[] args) throws Exception {
		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入一张图片的绝对路径：");
		String path = sc.next();//"C:/aaa/bbb/c.jpg"
		File file = new File(path);
		
		//复制文件
		//创建普通字节输入流对象
		FileInputStream fis = new FileInputStream(file);
		
		//创建普通字节输出流对象
		FileOutputStream fos = new FileOutputStream(file.getName());
		
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
