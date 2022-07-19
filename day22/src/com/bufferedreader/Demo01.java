package com.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//public BufferedReader(Reader in)
		/*FileReader fr = new FileReader("a.txt");
		BufferedReader br = new BufferedReader(fr);*/
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
	}
}
