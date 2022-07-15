package com.file;

import java.io.File;

public class Demo05 {
	public static void main(String[] args) {
		//创建File对象
		File file = new File("aaa");
		//File file = new File("D:/eclipse-workspace/day20/aaa");
		
		//public String getPath()
		/*String path = file.getPath();
		System.out.println(path);*/
		
		//public String getAbsolutePath()
		String path = file.getAbsolutePath();
		System.out.println(path);
	}
}
