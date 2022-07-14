package com.file;

import java.io.File;

public class Demo04 {
	public static void main(String[] args) {
		//创建File对象
		File file = new File("aaa\\bbb");
		
		//public boolean mkdirs()
		boolean b = file.mkdirs();
		System.out.println(b);
	}
}
