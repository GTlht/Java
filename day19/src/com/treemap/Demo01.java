package com.treemap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo01 {
	public static void main(String[] args) {
		//创建容器
		TreeMap<String, String> tm = new TreeMap<>();
		
		//添加元素
		tm.put("tom", "9527");
		tm.put("jerry", "9528");
		tm.put("tom", "9529");
		tm.put("rose", "9530");
		
		//遍历容器
		/*Set<String> set = tm.keySet();
		for (String key : set) {
			String value = tm.get(key);
			System.out.println(key + "..." + value);
		}*/
		
		Set<Entry<String, String>> set = tm.entrySet();
		for (Entry<String, String> entry : set) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "..." + value);
		}
	}
}
