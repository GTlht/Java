package com.list;

import java.util.ArrayList;
import java.util.List;

public class Demo04 {
	public static void main(String[] args) {
		//创建容器
		List list = new ArrayList();
		
		//添加元素
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		System.out.println(list);
		
		//Object set(int index,E element)
		Object obj = list.set(1, "sss");
		System.out.println(obj);
		
		System.out.println(list);
	}
}
