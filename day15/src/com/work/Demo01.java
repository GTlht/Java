package com.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//已知String s = "2022-07-07"，要求将天数增加1天，变成String s = "2022-07-08"？
public class Demo01 {
	public static void main(String[] args) throws ParseException {
		String s = "2022-07-07";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//解析：String -> Date
		Date date = sdf.parse(s);
		long time = date.getTime();
		
		//+1天
		time += 1 * 24 * 60 * 60 * 1000;
		
		//格式化：Date -> String
		Date date1 = new Date(time);
		s = sdf.format(date1);
		
		System.out.println(s);
	}
}
