package com.collection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("all")
public class Demo04 {
	public static void main(String[] args) {
		//创建容器
		Collection c = new ArrayList();
		
		//添加元素
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		
		System.out.println(c);
		
		//void clear()
		c.clear();
		
		System.out.println(c);
	}
}
