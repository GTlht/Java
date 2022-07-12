package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo02 {
	public static void main(String[] args) {
		//创建容器
		Set<String> set = new HashSet<String>();
		
		//添加元素
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		//遍历容器
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
}
