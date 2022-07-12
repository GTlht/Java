package com.set;

import java.util.HashSet;
import java.util.Set;

public class Demo01 {
	public static void main(String[] args) {
		//创建容器
		Set<String> set = new HashSet<String>();
		
		//添加元素
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		//遍历容器
		Object[] objs = set.toArray();
		for (Object obj : objs) {
			System.out.println(obj);
		}
	}
}
