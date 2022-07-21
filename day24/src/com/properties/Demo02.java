package com.properties;

import java.util.Properties;
import java.util.Set;

public class Demo02 {
	public static void main(String[] args) {
		//创建容器
		Properties p = new Properties();
		
		//添加元素
		p.put("tom", 18);
		p.put("jerry", 19);
		p.put("rose", 16);
		
		//遍历容器
		Set<Object> set = p.keySet();
		for (Object key : set) {
			Object value = p.get(key);
			System.out.println(key + "..." + value);
		}
	}
}
