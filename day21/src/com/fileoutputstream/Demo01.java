package com.fileoutputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo01 {
	public static void main(String[] args) throws FileNotFoundException {
		/*//public FileOutputStream(File file)
		//File file = new File("aaa");
		File file = new File("aaa.txt");
		FileOutputStream fos = new FileOutputStream(file);
		System.out.println(fos);*/
		
		//public FileOutputStream(String name)
		//FileOutputStream fos = new FileOutputStream("aaa.txt");
		FileOutputStream fos = new FileOutputStream("bbb.txt");
		System.out.println(fos);
	}
}
