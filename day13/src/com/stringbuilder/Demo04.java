package com.stringbuilder;

public class Demo04 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abcde");
		System.out.println(sb);
		
		//public StringBuilder reverse()
		//public String toString()
		sb.reverse();
		System.out.println(sb);
		
	}
}
