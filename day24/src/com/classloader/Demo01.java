package com.classloader;

public class Demo01 {
	public static void main(String[] args) {
		//获取类的字节码文件对象
		Class clazz = Person.class;
		
		//获取类加载器对象
		ClassLoader classLoader = clazz.getClassLoader();
		
		System.out.println(classLoader);//AppClassLoader
	}
}

class Person {}
