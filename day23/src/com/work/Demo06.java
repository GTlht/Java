package com.work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/*
6.项目根路径下有text.txt文件，内容如下：
	我爱Java
	123456
	利用IO流的知识读取text.txt文件的内容反转后写入text.txt文件中，内容如下：
	123456
	我爱Java
*/

public class Demo06 {
	public static void main(String[] args) throws Exception {
		//创建高效字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("text.txt"));
		
		//创建容器
		ArrayList<String> al = new ArrayList<>();
		
		//一次读取一行
		String line = null;
		while((line = br.readLine()) != null) {
			al.add(line);
		}
		
		//释放资源
		br.close();
		
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));
		
		//倒着遍历容器
		for(int i = al.size() - 1; i >= 0; i--) {
			String str = al.get(i);
			bw.write(str);
			bw.newLine();
		}
		
		//释放资源
		bw.close();
		
	}
}
