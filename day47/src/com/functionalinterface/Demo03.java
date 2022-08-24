package com.functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("a");
		al.add("bbb");
		al.add("aaaaa");
		al.add("cc");
		al.add("dddd");
		
		System.out.println(al);
		
		//需求：对字符串的长度进行排序：大到小
		Collections.sort(al, getComparator());
		
		System.out.println(al);
	}
	
	public static Comparator<String> getComparator() {
		/*return new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.length() - s1.length();
			}
		};*/
		
		//return (String s1, String s2) -> {return s2.length() - s1.length();};
		
		return (s1, s2) -> s2.length() - s1.length();
	}
}
