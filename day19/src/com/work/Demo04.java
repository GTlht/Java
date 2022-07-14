package com.work;

import java.util.HashSet;
import java.util.Random;

/*
4.编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
*/

public class Demo04 {
	public static void main(String[] args) {
		//创建容器
		HashSet<Integer> hs = new HashSet<>();
		
		//创建随机数对象
		Random random = new Random();
		
		//存储数据
		while(hs.size() < 10) {
			//获取随机数1-20
			int num = random.nextInt(20) + 1;
			//存储
			hs.add(num);
		}
		
		for (Integer in : hs) {
			System.out.println(in);
		}
	}
}
