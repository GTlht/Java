package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo03 {
	public static void main(String[] args) {
		//创建容器
		Set<String> set = new HashSet<String>();
		
		//添加元素
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		//遍历容器
		for (String str : set) {
			System.out.println(str);
		}
	}
}
