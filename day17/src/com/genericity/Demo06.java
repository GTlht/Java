package com.genericity;

import java.util.ArrayList;

public class Demo06 {
	public static void main(String[] args) {
		/*ArrayList<? extends Number> al1 = new ArrayList<Number>();
		ArrayList<? extends Number> al2 = new ArrayList<Integer>();
		ArrayList<? extends Number> al3 = new ArrayList<Double>();
		ArrayList<? extends Number> al4 = new ArrayList<Object>();
		ArrayList<? extends Number> al5 = new ArrayList<String>();*/
		
		/*ArrayList<String> al = new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		print(al);*/
	}
	
	public static void print(ArrayList<? extends Number> al) {
		for (Number n : al) {
			System.out.println(n);
		}
	}
}
