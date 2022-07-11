package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo06 {
	public static void main(String[] args) {
		//创建容器
		List list = new ArrayList();
		
		//添加元素
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//遍历容器
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
