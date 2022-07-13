package com.hashset;

import java.util.HashSet;

public class Demo01 {
	public static void main(String[] args) {
		//创建容器
		HashSet<String> hs = new HashSet<String>();
		
		//添加元素
		hs.add("aaa");
		hs.add("bbb");
		hs.add("aaa");
		hs.add("ccc");
		
		//遍历容器
		/*Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}*/
		
		for (String str : hs) {
			System.out.println(str);
		}
	}
}
