package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo08 {
	/*public static void main(String[] args) throws ParseException, FileNotFoundException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2000/10/10");//底层会创建ParseException
		System.out.println(date);
		
		FileInputStream fis = new FileInputStream("");//底层会创建 FileNotFoundException
	}*/
	
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2000/10/10");//底层会创建ParseException
		System.out.println(date);
		
		FileInputStream fis = new FileInputStream("");//底层会创建 FileNotFoundException
	}
}
