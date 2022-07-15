package com.file;

import java.io.File;

public class Demo06 {
	public static void main(String[] args) {
		//创建对象
		//File file = new File("aaa");
		File file = new File("a.txt");
		
		//public long length()
		long size = file.length();
		System.out.println(size);
	}
}
