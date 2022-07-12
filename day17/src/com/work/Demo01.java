package com.work;

import java.util.ArrayList;

/*
1.请按以下要求编写代码：
	1.定义一个只能存储字符串的集合对象；
	2.向集合内添加以下数据：
		“孙悟空”
		“猪八戒”
		“沙和尚”
		“铁扇公主”
	3.不用遍历，直接打印集合；
	4.获取第4个元素
	5.打印一下集合大小；
	6.删除元素“铁扇公主”
	7.删除第3个元素
	8.将元素“猪八戒”改为“猪悟能”
	9.再次打印集合;
*/

public class Demo01 {
	public static void main(String[] args) {
		//定义一个只能存储字符串的集合对象
		ArrayList al = new ArrayList();
		
		//添加数据
		al.add("孙悟空");
		al.add("猪八戒");
		al.add("沙和尚");
		al.add("铁扇公主");
		
		//3.不用遍历，直接打印集合；
		System.out.println(al);
		
		//4.获取第4个元素
		Object obj = al.get(3);
		System.out.println(obj);
		
		//5.打印一下集合大小；
		System.out.println(al.size());
		
		//6.删除元素“铁扇公主”
		al.remove("铁扇公主");
		System.out.println(al);
		
		//7.删除第3个元素
		al.remove(2);
		System.out.println(al);
		
		//8.将元素“猪八戒”改为“猪悟能”
		al.set(1, "猪悟能");
		
		//9.再次打印集合;
		System.out.println(al);
	}
}
