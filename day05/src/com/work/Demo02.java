package com.work;
/*
	2. 判断春夏秋冬(ifelse/swtich)
		需求：键盘录入一个数(代表月份)，判断该数字是哪个季节
		春天：3,4,5
		夏天：6,7,8
		秋天：9,10,11
		冬天：12,1,2
*/

import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请录入一个月份：");
		int num = sc.nextInt();
		
		//判断该月份是什么季节
		if(num >= 3 && num <= 5) {
			System.out.println(num + "是春天");
		} else if(num >= 6 && num <= 8) {
			System.out.println(num + "是夏天");
		} else if(num >= 9 && num <= 11) {
			System.out.println(num + "是秋天");
		} else if(num > 12 || num < 1) {
			System.out.println("滚犊子");
		} else {
			System.out.println(num + "是冬季");
		}
	}
}
