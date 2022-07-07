package com.localdatetime;

import java.time.LocalDateTime;

public class Demo06 {
	public static void main(String[] args) {
		//获取LocalDateTime对象
		LocalDateTime localDateTime = LocalDateTime.now();
		
		//public LocalDateTime plusYears(long years)
		//localDateTime = localDateTime.plusYears(1);
		localDateTime = localDateTime.plusYears(-1);
		
		System.out.println(localDateTime);
	}
}
