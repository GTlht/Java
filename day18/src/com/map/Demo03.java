package com.map;

import java.util.HashMap;
import java.util.Map;

public class Demo03 {
	public static void main(String[] args) {
		//创建容器
		Map<String, String> map = new HashMap<>();
		
		//添加元素
		map.put("9527", "tom");
		map.put("9528", "jerry");
		map.put("9529", "rose");
		
		//V get(Object key)
		String value = map.get("9529");
		System.out.println(value);
	}
}
