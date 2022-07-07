package com.calendar;

import java.util.Calendar;
import java.util.Date;

public class Demo04 {
	public static void main(String[] args) {
		//创建
		Calendar calendar = Calendar.getInstance();
		
		/*//public final Date getTime()
		Date date = calendar.getTime();
		System.out.println(date);*/
		
		//public abstract void add(int field,int amount)
		//calendar.add(Calendar.YEAR, 1);
		calendar.add(Calendar.YEAR, -1);
		System.out.println(calendar.get(Calendar.YEAR));
	}
}
