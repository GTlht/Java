package com.linkedhashset;

import java.util.LinkedHashSet;

public class Demo01 {
	public static void main(String[] args) {
		//创建容器
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		//添加元素
		lhs.add("ccc");
		lhs.add("aaa");
		lhs.add("ddd");
		lhs.add("bbb");
		lhs.add("ccc");
		lhs.add("eee");
		
		//遍历容器
		for (String str : lhs) {
			System.out.println(str);
		}
	}
}
