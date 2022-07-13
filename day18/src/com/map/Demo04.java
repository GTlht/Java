package com.map;

import java.util.HashMap;
import java.util.Map;

public class Demo04 {
	public static void main(String[] args) {
		//创建容器
		Map<String, String> map = new HashMap<>();
		
		//添加元素
		map.put("9527", "tom");
		map.put("9528", "jerry");
		map.put("9529", "rose");
		
		//boolean containsKey(Object key)
		//boolean b = map.containsKey("9526");
		boolean b = map.containsKey("9527");
		System.out.println(b);
		
		//boolean containsValue(Object value)
		boolean b1 = map.containsValue("jerry");
		System.out.println(b1);
	}
}
