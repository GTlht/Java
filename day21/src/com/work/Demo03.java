package com.work;

import java.io.File;

/*
3.打印出指定的文件夹aaa中的所有以.java为后缀名文件的绝对路径？
	-- aaa
		-- bbb
			-- ccc
				-- ccc.java
			-- bbb.java
			-- bbb.txt
		-- aaa.txt
		-- aaa.java
		-- aaa.jpg
*/
public class Demo03 {
	public static void main(String[] args) {
		File file = new File("aaa");
		findJavaFile(file);
	}
	
	public static void findJavaFile(File file) {
		File[] files = file.listFiles();
		
		for (File f : files) {
			//判断是否是文件
			if(f.isFile()) {
				//判断是否以.java为后缀名的文件
				if(f.getName().endsWith(".java")) {
					System.out.println(f.getAbsolutePath());
				}
			} else {
				findJavaFile(f);
			}
		}
	}
}
