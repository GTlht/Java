package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03 {
	public static void main(String[] args) {
		Date date = new Date();
		
		//格式化操作
		//SimpleDateFormat sdf = new SimpleDateFormat();
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
		
		//格式化
		String time = sdf.format(date);
		
		System.out.println(time);//2022-07-06 17:04:11 星期三
								 //2022年07月06日 17:04:49 星期三
	}
}
