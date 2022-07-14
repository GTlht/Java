package com.file;

import java.io.File;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		//创建File对象
		//File file = new File("C:\\Users\\apple\\Desktop\\bbb.txt");
		//File file = new File("C:\\Users\\apple\\Desktop\\aaa");
		File file = new File("aaa.txt");
		
		//public boolean createNewFile()
		boolean b = file.createNewFile();
		System.out.println(b);
		
	}
}
