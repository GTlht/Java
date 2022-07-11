package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo06 {
	public static void main(String[] args) {
		//创建容器
		LinkedList ll = new LinkedList();
		
		//添加元素
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		
		//遍历容器
		for (Object obj : ll) {
			System.out.println(obj);
		}
	}
}
