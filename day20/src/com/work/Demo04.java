package com.work;

import java.util.HashMap;
import java.util.Set;

/*
4.分析以下需求，并用代码实现：
	(1)统计每个单词出现的次数
	(2)有如下字符串"If you want to change your fate I think you must come to the woniu to learn java"
	(3)打印格式：
		to=3
  		think=1
  		you=2
  		//........
*/

public class Demo04 {
	public static void main(String[] args) {
		String str = "If you want to change your fate I think you must come to the woniu to learn java";
		
		String[] strs = str.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for (String s : strs) {
			if(hm.containsKey(s)) {
				Integer value = hm.get(s);
				value++;
				hm.put(s, value);
			} else {
				hm.put(s, 1);
			}
		}
		
		Set<String> set = hm.keySet();
		for (String key : set) {
			Integer value = hm.get(key);
			System.out.println(key + "=" + value);
		}
	}
}
