package com.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Demo05 {
	public static void main(String[] args) {
		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入一个年份：");
		int year = sc.nextInt();
		
		//判断该年份是平年还是闰年
		
		//创建对象
		Calendar c = Calendar.getInstance();
		
		//设置年份
		c.set(Calendar.YEAR, year);
		
		//设置月份为3月份
		c.set(Calendar.MONTH, 2);
		
		//设置日为1号
		c.set(Calendar.DAY_OF_MONTH, 1);
		
		//日减去1
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		//获取日
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		//判断
		if(day == 29) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "是平年");
		}
		
	}
}
