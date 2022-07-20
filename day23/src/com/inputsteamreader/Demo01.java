package com.inputsteamreader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		//public InputStreamReader(InputStream in)
		/*FileInputStream fis = new FileInputStream("a.txt");
		InputStreamReader isr = new InputStreamReader(fis);*/
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
		
	}
}
