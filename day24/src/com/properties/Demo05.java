package com.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo05 {
	public static void main(String[] args) throws Exception {
		//创建容器
		Properties p = new Properties();
		
		System.out.println(p);
		
		//public void load(InputStream inStream)
		p.load(new FileInputStream("a.txt"));
		
		System.out.println(p);
		
		Set<String> set = p.stringPropertyNames();
		for (String key : set) {
			String value = p.getProperty(key);
			System.out.println(key + "..." + value);
		}
		
	}
}
