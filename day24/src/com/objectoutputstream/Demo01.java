package com.objectoutputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.pojo.Pig;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//创建序列化流
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
		
		//写出对象
		Pig pig = new Pig("tom", 18);
		oos.writeObject(pig);
	}
}

