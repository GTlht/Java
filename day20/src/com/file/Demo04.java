package com.file;

import java.io.File;

public class Demo04 {
	public static void main(String[] args) {
		//创建File对象
		//File file = new File("aaa");
		//File file = new File("a.txt");
		File file = new File("D:/图片/1.jpg");
		
		//public String getName()
		String name = file.getName();
		System.out.println(name);
	}
}
