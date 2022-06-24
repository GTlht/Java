package com.work;

import java.util.Scanner;

/*
4. 判断星期数(switch)
	需求：键盘录入一个数字，判断该数字是星期几
	1-7

*/
public class Demo05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请录入一个数字：");
		int num = sc.nextInt();
		
		//判断该数字是星期几
		switch(num) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("滚犊子");
		}
		
	}
}
