package com.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo04 {
	public static void main(String[] args) {
		try {
			//发生错误的代码，红线
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse("2000/10/10");
			System.out.println(date);
		} catch(Exception e) {//Exception e = new ParseException
			e.printStackTrace();
		}
		
		System.out.println("滚犊子");
	}
}
