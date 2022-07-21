package com.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo01 {
	public static void main(String[] args) throws FileNotFoundException {
		//public FileInputStream(File file)
		//FileInputStream fis = new FileInputStream(new File("a.txt"));
		//FileInputStream fis = new FileInputStream(new File("aaa"));
		/*FileInputStream fis = new FileInputStream(new File("a.txt"));
		System.out.println(fis);*/
		
		//public FileInputStream(String name)
		FileInputStream fis = new FileInputStream("a.txt");
		System.out.println(fis);
	}
}
