package com.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo01 {
	public static void main(String[] args) {
		//创建容器
		HashMap<String, Integer> hm = new HashMap<>();
		
		//添加元素
		hm.put("tom", 18);
		hm.put("jerry", 18);
		hm.put("rose", 19);
		hm.put("tom", 23);
		hm.put("jack", 24);
		
		//遍历容器
		/*Set<String> set = hm.keySet();
		for (String key : set) {
			Integer value = hm.get(key);
			System.out.println(key + "..." + value);
		}*/
		
		Set<Entry<String, Integer>> set = hm.entrySet();
		for (Entry<String, Integer> entry : set) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + "..." + value);
		}
	}
}
