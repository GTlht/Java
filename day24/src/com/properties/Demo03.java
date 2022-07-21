package com.properties;

import java.util.Properties;
import java.util.Set;

public class Demo03 {
	public static void main(String[] args) {
		//创建容器
		Properties p = new Properties();
		
		//添加元素
		p.setProperty("tom", "成都");
		p.setProperty("jerry", "都江堰");
		p.setProperty("rose", "眉山");
		p.setProperty("jack", "乐山");
		
		//遍历容器
		Set<String> set = p.stringPropertyNames();
		for (String key : set) {
			String value = p.getProperty(key);
			System.out.println(key + "..." + value);
		}
	}
}
