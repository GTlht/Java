package com;

//1.导包
import java.util.Scanner;

public class Demo16 {
	public static void main(String[] args) {
		//2.创建对象
		Scanner sc = new Scanner(System.in);
		
		//3.调用方法
		System.out.println("请录入一个数字：");
		int a = sc.nextInt();
		System.out.println("请录入一个数字：");
		int b = sc.nextInt();
		
		//获取两个数的较大值
		int max = a > b ? a : b;
		System.out.println("最大值为：" + max);
	}
}
