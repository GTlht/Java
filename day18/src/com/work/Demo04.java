package com.work;

import java.util.ArrayList;
import java.util.List;

/*
4.分析以下需求，并用代码实现：
	(1)有如下代码：
		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		
		System.out.println(frequency(list, "a"));	
		System.out.println(frequency(list, "b"));	
		System.out.println(frequency(list, "c"));	
		System.out.println(frequency(list, "d"));	
		System.out.println(frequency(list, "xxx"));
	(2)定义方法统计集合中指定元素出现的次数，如"a" 3,"b" 2,"c" 1
*/

public class Demo04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		
		System.out.println(frequency(list, "a"));	
		System.out.println(frequency(list, "b"));	
		System.out.println(frequency(list, "c"));	
		System.out.println(frequency(list, "d"));	
		System.out.println(frequency(list, "xxx"));
	}
	
	public static int frequency(List<String> list, String str) {
		//计数器
		int count = 0;
		
		//遍历
		for (String s : list) {
			if(s.equals(str)) {
				count++;
			}
		}
		
		return count;
	}
}
