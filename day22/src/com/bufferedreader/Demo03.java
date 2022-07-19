package com.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo03 {
	public static void main(String[] args) throws Exception {
		//创建高效字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		/*//public String readLine()
		String s1 = br.readLine();
		System.out.println(s1);
		
		String s2 = br.readLine();
		System.out.println(s2);
		
		String s3 = br.readLine();
		System.out.println(s3);
		
		String s4 = br.readLine();
		System.out.println(s4);*/
		
		String line = null;
		while((line = br.readLine()) != null ) {
			System.out.println(line);
		}
	}
}
