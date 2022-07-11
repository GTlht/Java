package com.list;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
	public static void main(String[] args) {
		//创建容器
		List list = new ArrayList();
		
		//添加元素
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//Object get(int index)
		Object obj1 = list.get(0);
		System.out.println(obj1);
		
		Object obj2 = list.get(1);
		System.out.println(obj2);
		
		Object obj3 = list.get(2);
		System.out.println(obj3);
		
		/*Object obj4 = list.get(3);
		System.out.println(obj4);*/
	}
}
