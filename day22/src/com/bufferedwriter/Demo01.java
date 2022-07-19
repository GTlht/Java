package com.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		//public BufferedWriter(Writer out)
		FileWriter fw = new FileWriter("a.txt");
		BufferedWriter bw = new BufferedWriter(fw);
	}
}
