package com.treeset;

import java.util.TreeSet;

public class Demo01 {
	public static void main(String[] args) {
		//创建容器
		TreeSet<String> ts = new TreeSet<String>();
		
		//添加元素
		ts.add("aaa");
		ts.add("ccc");
		ts.add("aaa");
		ts.add("bbb");
		
		//遍历
		for (String str : ts) {
			System.out.println(str);
		}
	}
}
