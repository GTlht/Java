package com.array;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		//创建数组容器
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入一个数字：");
		int num = sc.nextInt();
		
		//标记
		boolean flag = false;//false代表没找，true代表找到了
		
		//遍历容器
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				System.out.println(i);
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println(-1);
		}
		
	}
}
