package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02 {
	public static void main(String[] args) {
		//创建容器
		ArrayList<Integer> al = new ArrayList<>();
		
		//添加元素
		al.add(1);
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(5);
		
		System.out.println(al);
		
		//public static <T extends Comparable<? super T>> void sort(List<T> list)
		Collections.sort(al);
		
		System.out.println(al);
	}
}
