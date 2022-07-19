package com.filewriter;

import java.io.FileWriter;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//public FileWriter(File file)
		/*FileWriter fw = new FileWriter(new File("a.txt"));
		System.out.println(fw);*/
		
		//public FileWriter(String fileName)
		FileWriter fw = new FileWriter("b.txt");
		System.out.println(fw);
	}
}
