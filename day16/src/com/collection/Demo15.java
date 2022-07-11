package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo15 {
	public static void main(String[] args) {
		//创建容器
		Collection c = new ArrayList();
		
		//添加元素
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		
		//遍历容器
		for(Object obj : c) {
			System.out.println(obj);
		}
	}
}
