package com.linkedlist;

import java.util.LinkedList;

public class Demo02 {
	public static void main(String[] args) {
		//创建容器
		LinkedList ll = new LinkedList();
		
		//添加元素
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		
		System.out.println(ll);
		
		//public E getFirst()
		//public E getLast()
		Object obj1 = ll.getFirst();
		System.out.println(obj1);
		
		Object obj2 = ll.getLast();
		System.out.println(obj2);
	}
}
