package com.objectinputstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.pojo.Pig;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//public ObjectInputStream(InputStream in)
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
		
		//读取数据
		//public final Object readObject()
		/*Object obj = ois.readObject();
		System.out.println(obj);*/
		
		Pig pig = (Pig)ois.readObject();
		System.out.println(pig);
	}
}
