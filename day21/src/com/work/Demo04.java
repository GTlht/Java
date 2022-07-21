package com.work;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

/*
4.统计一个文件夹中每种文件的个数并打印(文件夹路径下没有子文件夹)
	打印格式如下：
		txt:3个
		doc:4个
		jpg:6个
*/
public class Demo04 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		File file = new File("aaa");
		
		File[] files = file.listFiles();
		
		for (File f : files) {
			String fileName = f.getName();
			String[] strs = fileName.split("\\.");
			String str = strs[strs.length - 1];
			
			//判断是否存在
			if(hm.containsKey(str)) {
				Integer value = hm.get(str);
				value++;
				hm.put(str, value);//修改
			} else {
				hm.put(str, 1);//添加
			}
		}
		
		Set<String> set = hm.keySet();
		for (String key : set) {
			Integer value = hm.get(key);
			System.out.println(key + ":" + value);
		}
	}
}
