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

public class Demo03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请录入一个月份：");
		int num = sc.nextInt();
		
		//判断该月份是什么季节
		switch(num) {
			case 3:
			case 4:
			case 5:
				System.out.println(num + "是春天");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(num + "是夏天");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(num + "是秋天");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(num + "是冬天");
				break;
			default:
				System.out.println("滚犊子");
		}
	}
}
