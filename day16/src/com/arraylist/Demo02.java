package com.arraylist;

import java.util.ArrayList;

public class Demo02 {
	public static void main(String[] args) {
		//创建容器
		ArrayList al = new ArrayList();
		
		//添加元素
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		
		//遍历容器
		Object[] objs = al.toArray();
		for (Object obj : objs) {
			System.out.println(obj);
		}
	}
}
