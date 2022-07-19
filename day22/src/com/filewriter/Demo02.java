package com.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		//创建普通字符输出流对象
		FileWriter fw = new FileWriter("a.txt");
		
		//public void write(int c)
		fw.write('a');
		fw.write('b');
		fw.write('c');
		
		//刷新
		fw.flush();
	}
}
