package com.file;

import java.io.File;

public class Demo07 {
	public static void main(String[] args) {
		//创建File对象
		//File file = new File("bbb");
		//File file = new File("a.txt");
		File file = new File("aaa");
		
		//public File[] listFiles()
		File[] files = file.listFiles();
		//System.out.println(files);
		/*for (File f : files) {
			System.out.println(f.getName());
		}*/
		
		for (File f : files) {
			if(f.isFile()) {
				System.out.println(f.getName());
			}
		}
	}
}
