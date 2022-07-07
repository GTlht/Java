package com.localdatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo05 {
	public static void main(String[] args) {
		/*//创建一个字符串
		String s = "2012-07-07 12:12:12";
		
		//解析操作
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime localDateTime = LocalDateTime.parse(s, dateTimeFormatter);
		System.out.println(localDateTime);*/
		
		//创建一个字符串
		String s = "2012-07-07";
		
		//解析操作
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.parse(s, dateTimeFormatter);
		System.out.println(localDate);
		
	}
}
