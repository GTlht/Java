package com.work;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//已知String s = "2022-07-07"，要求将天数增加1天，变成String s = "2022-07-08"？
public class Demo02 {
	public static void main(String[] args) {
		String s = "2022-07-07";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		//解析
		LocalDate localDate = LocalDate.parse(s, dateTimeFormatter);
		
		//+1
		localDate = localDate.plusDays(1);
		
		//格式化
		s = localDate.format(dateTimeFormatter);
		
		System.out.println(s);
	}
}
