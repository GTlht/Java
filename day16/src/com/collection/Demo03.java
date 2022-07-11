package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03 {
	public static void main(String[] args) {
		//创建集合容器
		Collection c = new ArrayList();
		
		c.add("aaa");
		
		System.out.println(c);
		
		//boolean addAll(Collection c)
		Collection c1 = new ArrayList();
		c1.add("aaa");
		c1.add("bbb");
		c1.add("ccc");
		
		c.addAll(c1);
		
		System.out.println(c);
	}
}
