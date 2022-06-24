package com.work;

/*
1. 判断奇数偶数
	需求：键盘录入一个数，判断该数字是奇数还是偶数
*/

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请录入一个数字：");
		int num = sc.nextInt();
		
		//判断数字是奇数还是偶数
		if(num % 2 == 0) {
			System.out.println(num + "是偶数");
		} else {
			System.out.println(num + "是奇数");
		}
	}
}
