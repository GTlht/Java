package com.objectoutputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//public ObjectOutputStream(OutputStream out)
		/*FileOutputStream fos = new FileOutputStream("a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);*/
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
		
	}
}
