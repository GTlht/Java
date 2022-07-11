package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {
	public static void main(String[] args) {
		//创建集合容器对象
		Collection c = new ArrayList();
		
		System.out.println(c);
		
		//boolean add(Object e)
		/*boolean b = c.add("aaa");
		System.out.println(b);
		
		boolean b1 = c.add("bbb");
		System.out.println(b1);*/
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		
		System.out.println(c);
		
	}
}
