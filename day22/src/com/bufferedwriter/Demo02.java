package com.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		//一次写出一个字符数据
		bw.write('a');
		bw.write('b');
		bw.write('c');
		//刷新
		bw.flush();
	}
}
