package com.exception;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo09 {
	public static void main(String[] args) throws Exception {
		aaa();
	}
	
	public static void aaa() throws Exception {
		bbb();
	}
	
	public static void bbb() throws Exception {
		ccc();
	}
	
	public static void ccc() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2000/10/10");//底层会创建ParseException pe = new ParseException();
		System.out.println(date);
	}
}
