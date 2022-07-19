package com.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03 {
	public static void main(String[] args) throws IOException {
		//创建普通字符输出流对象
		FileWriter fw = new FileWriter("b.txt");
		
		//public void write(char[] cbuf)
		/*char[] chs = {'a','b','c','d','e'};
		fw.write(chs);*/
		
		//public abstract void write(char[] cbuf,int off,int len)
		char[] chs = {'a','b','c','d','e'};
		fw.write(chs, 0, 3);
		
		fw.close();
	}
}
