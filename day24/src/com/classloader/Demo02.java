package com.classloader;

public class Demo02 {
	public static void main(String[] args) {
		//获取字节码文件对象
		Class clazz = Pig.class;
		
		//获取类加载器对象
		ClassLoader classLoader = clazz.getClassLoader();
		System.out.println(classLoader);
		
		//public final ClassLoader getParent()
		ClassLoader parentClassLoader = classLoader.getParent();
		System.out.println(parentClassLoader);
		
		ClassLoader parent = parentClassLoader.getParent();
		System.out.println(parent);
	}
}

class Pig {}
