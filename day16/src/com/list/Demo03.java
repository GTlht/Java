package com.list;

import java.util.ArrayList;
import java.util.List;

public class Demo03 {
	public static void main(String[] args) {
		//创建容器
		List list = new ArrayList();
		
		//添加元素
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		System.out.println(list);
		
		//Object remove(int index)
		Object obj = list.remove(1);
		System.out.println(obj);
		
		System.out.println(list);
	}
}
