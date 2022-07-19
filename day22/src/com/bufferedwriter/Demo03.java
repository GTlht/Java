package com.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Demo03 {
	public static void main(String[] args) throws Exception {
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		
		//一次写出一个字符数据
		bw.write("在吗");
		//bw.write("\r\n");
		//public void newLine()
		bw.newLine();
		bw.write("约吗");
		
		//刷新
		bw.flush();
	}
}
