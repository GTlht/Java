package com.work;

import java.io.File;
import java.util.Scanner;

//5.从键盘接收一个文件夹路径,统计该文件夹大小，并输出结果(文件夹路径下没有子文件夹)
public class Demo05 {
	public static void main(String[] args) {
		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请您录入一个文件夹的路径：");
		String path = sc.next();
		
		//统计大小
		long size = 0;
		File file = new File(path);
		File[] files = file.listFiles();
		for (File f : files) {
			size += f.length();
		}
		
		System.out.println(size);
	}
}
