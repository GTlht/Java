package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo06 {
	public static void main(String[] args) {
		//创建容器
		Collection c = new ArrayList();
		
		//添加元素
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		
		//boolean isEmpty()
		boolean b = c.isEmpty();
		System.out.println(b);
		
		c.clear();
		
		boolean b1 = c.isEmpty();
		System.out.println(b1);
	}
}
