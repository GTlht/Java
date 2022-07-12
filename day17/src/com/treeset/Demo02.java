package com.treeset;

import java.util.TreeSet;

public class Demo02 {
	public static void main(String[] args) {
		//创建容器
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		//添加元素
		ts.add(333);
		ts.add(111);
		ts.add(222);
		ts.add(111);
		
		//遍历
		for (Integer in : ts) {
			System.out.println(in);
		}
	}
}
