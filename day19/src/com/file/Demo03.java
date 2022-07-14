package com.file;

import java.io.File;

public class Demo03 {
	public static void main(String[] args) {
		//创建File对象
		//File file = new File("aaa");
		//File file = new File("bbb.txt");
		File file = new File("aaa\\bbb");
		
		//public boolean mkdir()
		boolean b = file.mkdir();
		System.out.println(b);
	}
}
