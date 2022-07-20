package com.outputstreamwriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		//创建转换输出流对象
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));
		
		//写出数据
		osw.write("约吗");
		
		//刷新
		osw.flush();
	}
}
