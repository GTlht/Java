package com.map;

import java.util.HashMap;
import java.util.Map;

public class Demo01 {
	public static void main(String[] args) {
		//创建容器
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		System.out.println(map);
		
		//V put(K key,V value)
		Integer in = map.put("tom", 18);//添加
		System.out.println(in);
		
		Integer in1 = map.put("jerry", 19);//添加
		System.out.println(in1);
		
		Integer in2 = map.put("tom", 23);//修改
		System.out.println(in2);
		
		System.out.println(map);
		
		//void clear()
		map.clear();
		
		System.out.println(map);
	}
}
