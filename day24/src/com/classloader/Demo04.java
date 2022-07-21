package com.classloader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo04 {
	public static void main(String[] args) throws IOException {
		/*//获取字节码文件对象
		Class clazz = Pig.class;
		
		//获取类加载器对象
		ClassLoader classLoader = clazz.getClassLoader();
		
		//获取读取配置文件的流对象
		InputStream is = classLoader.getResourceAsStream("aaa.properties");
		
		//加载配置文件
		Properties p = new Properties();
		p.load(is);
		
		//解析获取数据
		String name = p.getProperty("name");
		String age = p.getProperty("age");
		System.out.println(name + "..." + age);*/
		
		/*Properties p = new Properties();
		//InputStream is = new FileInputStream("src/aaa.properties");
		InputStream is = new FileInputStream("bin/aaa.properties");
		p.load(is);
		String name = p.getProperty("name");
		String age = p.getProperty("age");
		System.out.println(name + "..." + age);*/
		
		Properties p = new Properties();
		p.load(Pig.class.getClassLoader().getResourceAsStream("bin/aaa.properties"));
		String name = p.getProperty("name");
		String age = p.getProperty("age");
		System.out.println(name + "..." + age);
	}
}
