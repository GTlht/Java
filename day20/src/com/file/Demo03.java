package com.file;

import java.io.File;

public class Demo03 {
	public static void main(String[] args) {
		//创建File对象
		File file = new File("aaa");
		//File file = new File("bbb");
		//File file = new File("a.txt");
		
		//public boolean isFile()
		/*boolean b = file.isFile();
		System.out.println(b);*/
		
		//public boolean isDirectory()
		boolean b = file.isDirectory();
		System.out.println(b);
	}
}
