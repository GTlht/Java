package com.calendar;

import java.util.Calendar;

public class Demo02 {
	public static void main(String[] args) {
		//获取Calendar对象
		Calendar calendar = Calendar.getInstance();
		
		//public int get(int field)
		//int num = calendar.get(1);
		/*int num = calendar.get(Calendar.YEAR);
		System.out.println(num);*/
		
		//获取年
		int year = calendar.get(Calendar.YEAR);
		//获取月
		int month = calendar.get(Calendar.MONTH);
		//获取日
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		//获取时
		int hour = calendar.get(Calendar.HOUR);
		//获取分
		int minute = calendar.get(Calendar.MINUTE);
		//获取秒
		int second = calendar.get(Calendar.SECOND);
		
		System.out.println(year + "年" + (month+1) + "月" + day + "日" + " " + hour + ":" + minute + ":" + second);
	}
}