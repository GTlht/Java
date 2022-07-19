package com.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Demo04 {
	public static void main(String[] args) throws Exception {
		//创建普通字符输出流对象
		FileWriter fw = new FileWriter("c.txt");
		
		//public void write(String str)
		fw.write("ab约吗cd");
		
		//刷新
		fw.flush();
	}
}
