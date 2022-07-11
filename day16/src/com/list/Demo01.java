package com.list;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
	public static void main(String[] args) {
		//创建容器
		List list = new ArrayList();
		
		//添加元素
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//void add(int index,E element)
		list.add(2, "ddd");
		
		System.out.println(list);
		
	}
}
