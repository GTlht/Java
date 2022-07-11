package com.linkedlist;

import java.util.LinkedList;

public class Demo04 {
	public static void main(String[] args) {
		//创建容器
		LinkedList ll = new LinkedList();
		
		//添加元素
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		
		//遍历容器
		Object[] objs = ll.toArray();
		for (Object obj : objs) {
			System.out.println(obj);
		}
	}
}
