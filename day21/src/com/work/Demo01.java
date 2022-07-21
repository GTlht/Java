package com.work;

import java.io.File;
import java.io.IOException;

//1.在当前的项目上创建一个名字叫做aaa/bbb/ccc/aaa.txt？
public class Demo01 {
	public static void main(String[] args) throws IOException {
		//File file = new File("aaa/bbb/ccc/aaa.txt");
		/*boolean b = file.createNewFile();
		System.out.println(b);*/
		/*boolean b = file.mkdir();
		System.out.println(b);*/
		/*boolean b = file.mkdirs();
		System.out.println(b);*/
		
		
		File file1 = new File("aaa/bbb/ccc");
		boolean b1 = file1.mkdirs();
		System.out.println(b1);
		File file2 = new File(file1, "aaa.txt");
		boolean b2 = file2.createNewFile();
		System.out.println(b2);
	}
}
