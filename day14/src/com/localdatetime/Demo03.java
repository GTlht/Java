package com.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo03 {
	public static void main(String[] args) {
		//创建LocalDateTime对象
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);//2022-07-07T16:45:52.591
		
		//public LocalDate toLocalDate()
		LocalDate localDate = localDateTime.toLocalDate();
		System.out.println(localDate);//2022-07-07
		
		//public LocalTime toLocalTime()
		LocalTime localTime = localDateTime.toLocalTime();
		System.out.println(localTime);//16:45:52.591
	}
}
