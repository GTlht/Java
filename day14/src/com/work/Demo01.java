package com.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//你活了多少天？
public class Demo01 {
	public static void main(String[] args) throws ParseException {
		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入您的出生年月日(格式：2000-10-10)：");
		String time = sc.next();
		
		//获取出生的时间
		//解析
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		long start = sdf.parse(time).getTime();
		
		//获取当前时间
		Date date = new Date();
		long end = date.getTime();
		
		//计算
		long day = (end - start) / 1000 / 60 / 60 / 24;
		System.out.println(day);
		
	}
}
