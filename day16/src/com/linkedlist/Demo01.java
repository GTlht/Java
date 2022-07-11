package com.linkedlist;

import java.util.LinkedList;

public class Demo01 {
	public static void main(String[] args) {
		//创建容器
		LinkedList ll = new LinkedList();
		
		//添加元素
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		
		System.out.println(ll);
		
		//public void addFirst(E e)
		//public void addLast(E e)
		ll.addFirst("ddd");
		ll.addLast("eee");
		
		System.out.println(ll);
		
	}
}
