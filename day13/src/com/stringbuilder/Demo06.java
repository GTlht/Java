package com.stringbuilder;

import java.util.Scanner;

/*
键盘接收一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
			对称字符串：123321,111
			非对称字符串：123123
*/
public class Demo06 {
	public static void main(String[] args) {
		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入一个字符串：");
		String str = sc.next();
		
		//将String -> StringBuilder
		StringBuilder sb = new StringBuilder(str);
		
		//反转
		sb.reverse();
		
		//将StringBuilder -> String
		String s = sb.toString();
		
		//进行比对
		if(str.equals(s)) {
			System.out.println(str + "是对称的");
		} else {
			System.out.println(str + "不是对称的");
		}
	
	}
}
