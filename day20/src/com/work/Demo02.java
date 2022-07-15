package com.work;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
2.分析以下需求，并用代码实现：
	(1)利用键盘录入，输入一个字符串
	(2)统计该字符串中各个字符的数量
	(3)如：
		用户输入字符串"If~you-want~to~change-your_fate_I_think~you~must~come-to-the-woniu-to-learn-java"
		程序输出结果：a(6)c(2)e(5)f(2)g(1)h(3)I(2)i(2)j(1)k(1)l(1)-(8)m(2)n(5)o(8)r(2)s(1)t(8)u(5)v(1)w(2)y(3)~(6)_(3)
*/

public class Demo02 {
	public static void main(String[] args) {
		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入一个字符串：");
		String str = sc.next();
		
		//创建容器
		HashMap<Character, Integer> hm = new HashMap<>();
		
		//遍历字符串
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			//判断容器中是否包含以ch作为的键的元素
			if(hm.containsKey(ch)) {
				//不是第一次
				Integer value = hm.get(ch);
				value++;
				hm.put(ch, value);//修改
			} else {
				//第一次
				hm.put(ch, 1);//添加
			}
		}
		
		//字符串变量，用于拼接
		StringBuilder sb = new StringBuilder();
		
		//遍历容器
		Set<Character> set = hm.keySet();
		for (Character key : set) {
			Integer value = hm.get(key);
			//链式编程
			sb.append(key).append("(").append(value).append(")");
		}
		
		System.out.println(sb.toString());
	}
}
