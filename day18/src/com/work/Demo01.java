package com.work;

import java.util.ArrayList;

/*
1.分析以下需求，并用代码实现：
	(1)定义一个方法swap()传入集合和两个角标使集合中元素交换位置()
	(2)思路
		a.定义一个临时变量, 记住其中一个元素
		b.用第一个位置存放第二个位置上的元素
		c.用第二个位置存放临时变量记住的元素
*/
public class Demo01 {
	public static void main(String[] args) {
		//创建容器
		ArrayList<String> al = new ArrayList<String>();
		//添加元素
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add("ddd");
		al.add("eee");
		
		System.out.println(al);
		
		//调个
		swap(al, 0, 1);
		
		System.out.println(al);
	}
	
	public static void swap(ArrayList<String> al, int i, int j) {
		String temp = al.get(i);
		al.set(i, al.get(j));
		al.set(j, temp);
	}
}
