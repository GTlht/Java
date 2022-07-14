package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo04 {
	public static void main(String[] args) {
		//创建容器
		ArrayList<String> al = new ArrayList<>();
		
		//添加元素
		al.add("aa");
		al.add("aaa");
		al.add("c");
		al.add("aaaa");
		al.add("aaaaa");
		
		System.out.println(al);
		
		//public static <T> void sort(List<T> list, Comparator<? super T> c)
		//Collections.sort(al);
		Collections.sort(al, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				int n1 = s1.length() - s2.length();
				return n1;
			}
		});
		
		System.out.println(al);
		
	}
}
