package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo04 {
	public static void main(String[] args) {
		//创建容器
		ArrayList al = new ArrayList();
		
		//添加元素
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		
		//遍历容器
		for (Object obj : al) {
			System.out.println(obj);
		}
	}
}
