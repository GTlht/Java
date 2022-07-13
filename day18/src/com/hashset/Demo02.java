package com.hashset;

import java.util.HashSet;

public class Demo02 {
	public static void main(String[] args) {
		//创建容器
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//添加元素
		hs.add(111);
		hs.add(333);
		hs.add(222);
		hs.add(111);
		
		//遍历容器
		for (Integer in : hs) {
			System.out.println(in);
		}
	}
}
