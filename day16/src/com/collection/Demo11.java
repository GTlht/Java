package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo11 {
	public static void main(String[] args) {
		//创建容器
		Collection c = new ArrayList();
		
		//添加元素
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		
		//int size()
		int size = c.size();
		System.out.println(size);
	}
}
