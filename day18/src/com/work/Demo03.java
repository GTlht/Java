package com.work;

import java.util.ArrayList;

/*
3.分析以下需求，并用代码实现：
	(1)将集合中的元素反转
	(2)思路
		a.定义循环, 循环size()/2次
		b.第一次交换第一个和最后一个, 第二次交换第二个和倒数第二个
		
*/

public class Demo03 {
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
		
		//反转
		for(int i = 0, j = al.size() - 1; i < al.size() / 2; i++, j--) {
			String temp = al.get(i);
			al.set(i, al.get(j));
			al.set(j, temp);
		}
		
		System.out.println(al);
	}
}
