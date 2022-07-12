package com.genericity;

import java.util.ArrayList;

public class Demo05 {
	public static void main(String[] args) {
		/*ArrayList<?> al1 = new ArrayList<String>();
		ArrayList<?> al2 = new ArrayList<Integer>();
		ArrayList<?> al3 = new ArrayList<Character>();*/
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		print(al);
	}
	
	public static void print(ArrayList<?> al) {
		for (Object obj : al) {
			System.out.println(obj);
		}
	}
}
