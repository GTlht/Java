package com.file;

import java.io.File;

public interface Demo01 {
	public static void main(String[] args) {
		/*//public File(String pathname)
		File file = new File("C:\\Users\\apple\\Desktop\\aaa.txt");
		System.out.println(file);//C:\Users\apple\Desktop\aaa.txt
		
		File file1 = new File("C:\\Users\\apple\\Desktop\\bbb.txt");
		System.out.println(file1);//C:\Users\apple\Desktop\bbb.txt
		
		File file2 = new File("C:\\Users\\apple\\Desktop\\aaa");
		System.out.println(file2);*/
		
		/*//public File(String parent,String child)
		File file = new File("C:\\Users\\apple\\Desktop", "aaa.txt");
		System.out.println(file);
		
		File file1 = new File("C:\\Users\\apple\\Desktop", "bbb.txt");
		System.out.println(file1);*/
		
		//public File(File parent,String child)
		File file1 = new File("C:\\Users\\apple\\Desktop");
		File file2 = new File(file1, "aaa.txt");
		System.out.println(file2);
		
	}
}
