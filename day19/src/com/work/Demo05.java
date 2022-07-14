package com.work;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
5.从键盘接收一个字符串, 程序对其中所有字符进行排序,例如键盘输入: helloworld,程序打印:dehllloorw
*/
public class Demo05 {
	public static void main(String[] args) {
		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入一个字符串：");
		String str = sc.next();
		
		//创建容器
		TreeSet<Character> ts = new TreeSet<Character>(new Comparator<Character>() {
			@Override
			public int compare(Character c1, Character c2) {
				//小到大
				int n1 = c1 - c2;
				//不去重
				int n2 = n1 == 0 ? 1 : n1;
				return n2;
			}
		});
		
		//遍历字符串
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			ts.add(ch);
		}
		
		//遍历容器
		for (Character ch : ts) {
			System.out.print(ch);
		}
	}
}
