package com.classloader;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class Demo05 {
	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class clazz = Demo05.class;
		
		//获取类加载器对象
		ClassLoader classLoader = clazz.getClassLoader();
		
		//public URL getResource(String name)
		URL url = classLoader.getResource("a.properties");
		System.out.println(url);
		//public String getPath()
		String path = url.getPath();
		System.out.println(path);
		
		//创建容器
		Properties p = new Properties();
		InputStream is = new FileInputStream(path);
		p.load(is);
		
		//获取数据
		String name = p.getProperty("name");
		String age = p.getProperty("age");
		System.out.println(name + "..." + age);
		
//		Properties p = new Properties();
//		p.load(new FileInputStream(Demo05.class.getClassLoader().getResource("aaa.properties").getPath()));
//		String name = p.getProperty("name");
//		String age = p.getProperty("age");
//		System.out.println(name + "..." + age);

	}
}
