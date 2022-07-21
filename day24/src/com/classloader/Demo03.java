package com.classloader;

import java.io.InputStream;

public class Demo03 {
	public static void main(String[] args) {
		//获取字节码文件对象
		Class clazz = Pig.class;
		
		//获取类加载器对象
		ClassLoader classLoader = clazz.getClassLoader();
		
		//public InputStream getResourceAsStream(String name)
		InputStream is = classLoader.getResourceAsStream("aaa.properties");
		System.out.println(is);
		
	}
}
