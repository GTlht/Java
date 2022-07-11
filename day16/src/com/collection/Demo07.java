package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo07 {
	public static void main(String[] args) {
		//创建集合容器
		Collection c = new ArrayList();
		
		//添加元素
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		c.add("ddd");
		
		System.out.println(c);
		
		//boolean remove(Object o)
		//boolean b = c.remove("eee");
		boolean b = c.remove("aaa");
		System.out.println(b);
		
		System.out.println(c);
	}
}
