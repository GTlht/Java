package com.stringbuilder;

//已知有一个字符串String s = "abcde"，要求将字符串中的内容进行反转，String s = "edbca"，打印到控制台？
public class Demo05 {
	public static void main(String[] args) {
		String s = "abcde";
		
		//将字符串转换成StringBuilder
		StringBuilder sb = new StringBuilder(s);
		
		//反转
		sb.reverse();
		
		//StringBuilder转换String
		s = sb.toString();
		
		System.out.println(s);
	}
}
