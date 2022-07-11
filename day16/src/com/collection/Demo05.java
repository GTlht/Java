package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo05 {
	public static void main(String[] args) {
		//创建集合容器
		Collection c = new ArrayList();
		
		//添加元素
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		
		//boolean contains(Object o)
		//boolean b = c.contains("ddd");
		boolean b = c.contains("aaa");
		System.out.println(b);
	}
}
