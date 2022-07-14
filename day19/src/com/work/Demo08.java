package com.work;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/*

8.需求：给定一个数组：{"张柏芝","刘德华","张亮","张靓颖","杨颖","黄晓明"}
	1、编写一个方法：将数组中的元素添加到list集合中，并把所有姓张的人员读取出来打印到控制台上。
	2、对集合中的人员进行排序(主要条件:长度,次要条件:姓氏)倒叙,并保留重复的元素。
	3、把排序好的元素，使用迭代器的方式打印出来。
*/

public class Demo08 {
	public static void main(String[] args) {
		String[] strs = {"张柏芝","刘德华","张亮","张靓颖","杨颖","黄晓明","张亮"};
		
		//print(strs);
		
		//创建集合容器
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				//姓名的长度：大到小
				int n1 = s2.length() - s1.length();
				//姓名的姓氏：大到小
				int n2 = n1 == 0 ? s2.substring(0, 1).compareTo(s1.substring(0, 1)) : n1;
				//不去重
				int n3 = n2 == 0 ? 1 : n2;
				return n3;
			}
		});
		
		//遍历数组容器
		for (String str : strs) {
			//存储到集合容器
			ts.add(str);
		}
		
		//遍历集合容器
		for (String str : ts) {
			System.out.println(str);
		}
	}
	
	public static void print(String[] strs) {
		//创建集合容器
		ArrayList<String> al = new ArrayList<>();
		
		//遍历数组容器
		for(String str : strs) {
			//将数组容器中的元素存储到集合容器中
			al.add(str);
		}
		
		//遍历集合容器
		for (String str : al) {
			//判断是否姓张
			if(str.startsWith("张")) {
				System.out.println(str);
			}
		}
	}
}
