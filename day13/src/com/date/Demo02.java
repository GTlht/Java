package com.date;

import java.util.Date;

public class Demo02 {
	public static void main(String[] args) {
		//Date date = new Date();
		Date date = new Date(1657094887247L);
		
		//System.out.println(System.currentTimeMillis());
		//public long getTime()
		long time = date.getTime();
		System.out.println(time);
		
		//public void setTime(long time)
		date.setTime(1657094903859L);
		
		System.out.println(date.getTime());
	}
}
