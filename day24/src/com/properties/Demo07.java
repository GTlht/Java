package com.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo07 {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		//创建容器
		Properties p = new Properties();
		
		//加载a.properties文件
		//p.load(new FileInputStream("src/a.properties"));
		//p.load(new FileInputStream("a.properties"));
		p.load(new FileInputStream("bin/com/properties/a.properties"));
		//classpath路径下的配置文件，eclipse默认的classpath就是bin目录
		
		//解析
		String name = p.getProperty("name");
		String age = p.getProperty("age");
		String sex = p.getProperty("sex");
		
		System.out.println(name + "..." + age + "..." + sex);
	}
}
