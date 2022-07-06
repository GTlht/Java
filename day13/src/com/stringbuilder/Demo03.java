package com.stringbuilder;

public class Demo03 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		//StringBuilder sb = new StringBuilder("abc");
		
		//public int capacity()
		//public int length()
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("aaaaaaaaaaaaaaaaa");
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}
}
