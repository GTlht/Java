package com.work;

/*
	16.从任意一个数字开始报数，当你要报的数字是包含7或者7的倍数时都要说过，
		需求，使用程序在控制台打印出1-100之间的满足逢七必过规则的数据
*/
public class Demo10 {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			int ge = i / 1 % 10;
			int shi = i / 10 % 10;
			if(i % 7 == 0 || ge == 7 || shi == 7) {
				
			} else {
				System.out.println(i);
			}
		}
	}
}
