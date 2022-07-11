package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/*
	已知有一个集合，里面存储了以下元素："aaa","bbb","aaa","aaa","ccc","ddd"，
	要求将集合中的所有的"aaa"给干掉？(不可以使用removeif())
*/
public class Demo06 {
	public static void main(String[] args) {
		//创建容器
		ArrayList al = new ArrayList();
		
		//添加元素
		al.add("aaa");
		al.add("bbb");
		al.add("aaa");
		al.add("aaa");
		al.add("ccc");
		al.add("ddd");
		
		//删除所有的aaa
		/*for(Object obj : al) {
			if(obj.equals("aaa")) {
				al.remove(obj);
			}
		}*/
		
		/*Iterator it = al.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(obj.equals("aaa")) {
				al.remove(obj);
			}
		}*/
		
		/*Iterator it = al.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(obj.equals("aaa")) {
				it.remove();
			}
		}*/
		
		/*for(int i = 0; i < al.size(); i++) {
			Object obj = al.get(i);
			if("aaa".equals(obj)) {
				al.remove(obj);
			}
		}*/
		
		for(int i = 0; i < al.size(); i++) {
			Object obj = al.get(i);
			if("aaa".equals(obj)) {
				al.remove(obj);
				i--;
			}
		}
		
		
		System.out.println(al);
	}
}
