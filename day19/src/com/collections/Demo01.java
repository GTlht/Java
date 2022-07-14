package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01 {
	public static void main(String[] args) {
		//创建容器
		ArrayList<String> al = new ArrayList<>();
		
		//添加元素
		al.add("aaa");
		al.add("ddd");
		al.add("eee");
		al.add("bbb");
		al.add("ccc");
		
		System.out.println(al);
		
		//public static <T extends Comparable<? super T>> void sort(List<T> list)
		Collections.sort(al);
		
		System.out.println(al);
	}
}
