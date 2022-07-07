package com.localdatetime;

import java.time.LocalDateTime;

public class Demo01 {
	public static void main(String[] args) {
		/*//public static LocalDateTime now()
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);//2022-07-07T16:25:45.494
										  //2022-07-07T16:26:20.949*/
		
		/*public static LocalDateTime of(int year,
                Month month,
                int dayOfMonth,
                int hour,
                int minute,
                int second)*/
		
		LocalDateTime localDateTime = LocalDateTime.of(2000, 10, 10, 12, 12, 12);
		System.out.println(localDateTime);//2000-10-10T12:12:12
	}
}
