package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

//题二：创建一个集合容器，里面存储String和Integer类型的数据，要求删除里面的所有的Integer类型的数据，只保留字符串？
@SuppressWarnings("all")
public class Demo10 {
	public static void main(String[] args) {
		//创建容器
		Collection c = new ArrayList();
		
		//添加元素
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		c.add(111);
		c.add(222);
		c.add(333);
		
		System.out.println(c);
		
		//删除
		c.removeIf(new Predicate() {
			@Override
			public boolean test(Object t) {
				return t instanceof Integer;
			}
		});
		
		System.out.println(c);
	}
}
