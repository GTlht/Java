package com.list;

import java.util.ArrayList;
import java.util.List;

public class Demo07 {
	public static void main(String[] args) {
		//创建容器
		List list = new ArrayList();
		
		//添加元素
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//遍历容器
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}
