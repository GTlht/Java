package com.calendar;

import java.util.Calendar;

public class Demo03 {
	public static void main(String[] args) {
		//获取Calendar对象
		Calendar calendar = Calendar.getInstance();
		
		//获取年份
		System.out.println(calendar.get(Calendar.YEAR));//2022
		
		//public void set(int field,int value)
		calendar.set(Calendar.YEAR, 2000);
		
		//获取年份
		System.out.println(calendar.get(Calendar.YEAR));//2000
	}
}
