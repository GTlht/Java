package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo04 {
	public static void main(String[] args) throws ParseException {
		//解析操作
		
		String time = "2022年07月06日  17:05:38 星期三";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
		
		//解析
		Date date = sdf.parse(time);
		
		System.out.println(date);
	}
}
