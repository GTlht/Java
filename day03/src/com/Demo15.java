package com;

//1.导包
import java.util.Scanner;

public class Demo15 {
	//程序执行的入口
	public static void main(String[] args) {
		//2.创建对象
		Scanner sc = new Scanner(System.in);
		
		//温馨提示
		System.out.println("请您录入一个数字：");
		
		//3.调用方法
		int num = sc.nextInt();//等着你录入数据呢
		
		System.out.println(num);
	}
}
