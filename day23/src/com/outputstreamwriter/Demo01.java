package com.outputstreamwriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//public OutputStreamWriter(OutputStream out)
		/*FileOutputStream fos = new FileOutputStream("a.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);*/
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));
	}
}
