package com.genericity;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01 {
	public static void main(String[] args) {
		/*//创建容器
		ArrayList al = new ArrayList();
		
		//添加元素
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		
		//遍历容器
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}*/
		
		//创建容器
		ArrayList<String> al = new ArrayList<String>();
		
		//添加元素
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		
		//遍历容器
		/*Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}*/
		
		for (String str : al) {
			System.out.println(str);
		}
	}
}
