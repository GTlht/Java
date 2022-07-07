package com.localdatetime;

import java.time.LocalDateTime;

public class Demo02 {
	public static void main(String[] args) {
		//获取日期时间对象
		LocalDateTime localDateTime = LocalDateTime.now();
		
		//获取年
		int year = localDateTime.getYear();
		//获取月
		int month = localDateTime.getMonthValue();
		//获取日
		int day = localDateTime.getDayOfMonth();
		//获取时
		int hour = localDateTime.getHour();
		//获取分钟
		int minute = localDateTime.getMinute();
		//获取秒
		int second = localDateTime.getSecond();
		
		System.out.println(year + "年" + month + "月" + day + "日" + " " + hour + ":" + minute + ":" + second);
	}
}
