package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo12 {
	public static void main(String[] args) {
		//创建容器
		Collection c = new ArrayList();
		
		//添加元素
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		
		//遍历容器
		//Object[] toArray()
		Object[] objs = c.toArray();
		for(int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
	}
}
