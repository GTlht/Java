package com.file;

import java.io.File;

public class Demo02 {
	public static void main(String[] args) {
		//创建File对象
		File file = new File("aaa");
		
		//public boolean exists()
		/*boolean b = file.exists();
		System.out.println(b);*/
		if(!file.exists()) {
			file.mkdirs();
		}
		

	}
}
