package com.linkedlist;

import java.util.LinkedList;

public class Demo03 {
	public static void main(String[] args) {
		//创建容器
		LinkedList ll = new LinkedList();
		
		//添加元素
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		
		System.out.println(ll);
		
		//public E removeFirst()
		//public E removeLast()
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll);
	}
}
