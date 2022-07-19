package com.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//public BufferedInputStream(InputStream in)
		/*FileInputStream fis = new FileInputStream("a.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);*/
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
		System.out.println(bis);
	}
}
