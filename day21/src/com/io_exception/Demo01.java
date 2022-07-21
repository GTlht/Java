package com.io_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo01 {
	public static void main(String[] args) {
		
	}
}

class Fu {
	public void print() {
		
	}
}

class Zi extends Fu {
	@Override
	public void print() {
		//创建普通字节输入流对象
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
