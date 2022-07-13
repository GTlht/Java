package com.work;

import java.util.ArrayList;
import java.util.List;

/*
5.分析以下需求，并用代码实现：
	定义一个replaceAll方法,用传入集合的新值替换集合中的老值(list,old,new)
*/

public class Demo05 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		System.out.println(list);
		replaceAll(list, "aaa", "sss");
		System.out.println(list);
	}
	
	public static void replaceAll(List<String> list, String oldStr, String newStr) {
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if(str.equals(oldStr)) {
				list.set(i, newStr);
			}
		}
	}
}
