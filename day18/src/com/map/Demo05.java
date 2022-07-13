package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo05 {
	public static void main(String[] args) {
		//创建容器
		Map<String, Integer> map = new HashMap<>();
		
		//添加元素
		map.put("tom", 18);
		map.put("jerry", 18);
		map.put("rose", 19);
		
		//Collection<V> values()
		Collection<Integer> c = map.values();
		for (Integer in : c) {
			System.out.println(in);
		}
		
		System.out.println("------------------------");
		
		//Set<K> keySet()
		Set<String> set = map.keySet();
		for (String str : set) {
			System.out.println(str);
		}
	}
}
