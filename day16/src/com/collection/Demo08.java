package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

@SuppressWarnings("all")
public class Demo08 {
	public static void main(String[] args) {
		//创建容器
		Collection c = new ArrayList();
		
		//添加元素
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		
		System.out.println(c);
		
		//boolean removeIf(Predicate filter)
		c.removeIf(new Predicate() {
			@Override
			public boolean test(Object t) {
				//return false;
				return true;
			}
		});
		
		System.out.println(c);
	}
}
