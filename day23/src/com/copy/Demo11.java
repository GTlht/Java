package com.copy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Demo11 {
	public static void main(String[] args) throws Exception {
		//创建高效字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		//创建打印流对象
		PrintWriter pw = new PrintWriter(new FileWriter("c.txt"), true);
		
		//一次读取一行，一次打印一行
		String line = null;
		while((line = br.readLine()) != null) {
			pw.println(line);
		}
		
		//释放资源
		/*br.close();
		pw.close();*/
	}
}
