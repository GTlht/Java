package com.localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo04 {
	public static void main(String[] args) {
		//获取LocalDateTime对象
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println(localDateTime);
		
		//格式化
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss E");
		String time = localDateTime.format(dateTimeFormatter);
		System.out.println(time);
	}
}
