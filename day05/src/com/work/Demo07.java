package com.work;

/*
	10.在控制台输出所有的水仙花数
*/

public class Demo07 {
	public static void main(String[] args) {
		for(int i = 100; i <= 999; i++) {
			int ge = i / 1 % 10;
			int shi = i / 10 % 10;
			int bai = i / 100 % 10;
			
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
				System.out.println(i);
			}
		}
	}
}
