package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

//题一：创建一个集合容器，里面只存储String类型数据，要求删除里面所有的长度大于3的字符串？
@SuppressWarnings("all")
public class Demo09 {
	public static void main(String[] args) {
		//创建容器
		Collection c = new ArrayList();
		
		//添加元素
		c.add("aaa");
		c.add("aaaaa");
		c.add("aa");
		c.add("aaaa");
		c.add("aaaaaaa");
		
		System.out.println(c);
		
		//删除
		c.removeIf(new Predicate() {
			@Override
			public boolean test(Object t) {
				String s = (String)t;
				return s.length() > 3;
			}
		});
		
		System.out.println(c);
	}
}
