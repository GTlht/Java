package com.work;

/*
	11.统计水仙花数共有多少个
*/

public class Demo08 {
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 100; i <= 999; i++) {
			int ge = i / 1 % 10;
			int shi = i / 10 % 10;
			int bai = i / 100 % 10;
			
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
