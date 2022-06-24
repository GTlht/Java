package com.work;

import java.util.Scanner;

/*
3. 考试奖励
	需求：键盘录入一个分数，判断该分数是优秀，还是良，还是及格，还是不及格
	优秀：100-90
	良：89-70
	及格：69-60
	不及格：60-
*/

public class Demo04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请录入一个分数：");
		int num = sc.nextInt();
		
		//判断该分数是什么等级
		if(num >= 90 && num <= 100) {
			System.out.println("优秀");
		} else if(num >= 70 && num <= 89) {
			System.out.println("良");
		} else if(num >= 60 && num <= 69) {
			System.out.println("及格");
		} else if(num >= 0 && num < 60) {
			System.out.println("不及格");
		} else {
			System.out.println("滚犊子");
		}
	}
}
