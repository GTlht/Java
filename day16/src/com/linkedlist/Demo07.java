package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo07 {
	public static void main(String[] args) {
		//创建容器
		LinkedList ll = new LinkedList();
		
		//添加元素
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		
		//遍历容器
		for(int i = 0; i < ll.size(); i++) {
			Object obj = ll.get(i);
			System.out.println(obj);
		}
	}
}
