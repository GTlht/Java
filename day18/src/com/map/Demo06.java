package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo06 {
	public static void main(String[] args) {
		//创建容器
		Map<String, String> map = new HashMap<String, String>();
		
		//添加元素
		map.put("tom", "成都");
		map.put("jerry", "都江堰");
		map.put("rose", "乐山");
		map.put("jack", "眉山");
		map.put("tony", "自贡");
		
		//遍历容器：通过键找值
		Set<String> set = map.keySet();
		for (String key : set) {
			String value = map.get(key);
			System.out.println(key + "..." + value);
		}
	}
}
