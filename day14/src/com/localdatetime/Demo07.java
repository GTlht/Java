package com.localdatetime;

import java.time.LocalDateTime;

public class Demo07 {
	public static void main(String[] args) {
		//获取LocalDateTime对象
		LocalDateTime localDateTime = LocalDateTime.now();
		
		//public LocalDateTime withYear(int year)
		localDateTime = localDateTime.withYear(2032);
		
		System.out.println(localDateTime);
	}
}
