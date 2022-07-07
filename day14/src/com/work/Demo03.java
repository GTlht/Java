package com.work;

import java.util.Scanner;

/*
2.分析以下需求，并用代码实现：
	(1)键盘录入一个小数，要求小数点后的小数位最少2位
	(2)定义方法，实现保留小数点后的两位小数(只舍不进)
	(3)如：输入5.6789 输出5.67,输入5.67389 输出5.67
*/
public class Demo03 {
	public static void main(String[] args) {
		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入一个小数：");
		String str = sc.next();//"5.6789"
		
		//解析
		String[] strs = str.split("\\.");
		str = strs[0] + "." + strs[1].substring(0, 2);//"5.67"
		System.out.println(str);
	}
}
