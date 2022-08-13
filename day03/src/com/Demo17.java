package com;

//导包
import java.util.Scanner;

public class Demo17 {
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//调用方法
		System.out.println("请录入一个字符串：");
		String str = sc.next();
		System.out.println(str);
	}
}
