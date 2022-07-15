package com.file;

import java.io.File;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		//File file = new File("aaa.txt");
		//File file = new File("aaa");
		//File file = new File("aaa/bbb");
		File file = new File("aaa");
		
		//创建
		/*boolean b = file.createNewFile();
		System.out.println(b);*/
		
		/*boolean b = file.mkdir();
		System.out.println(b);*/
		
		/*boolean b = file.mkdirs();
		System.out.println(b);*/
		
		//删除
		//public boolean delete()
		boolean b = file.delete();
		System.out.println(b);
		
	}
}
