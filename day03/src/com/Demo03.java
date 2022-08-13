package com;

public class Demo03 {
	public static void main(String[] args) {
		/*String s = "约吗";
		int i = 12;
		//String a = s + i;
		String a = i + s;
		System.out.println(a);// "约吗12"
							  // "12约吗"*/
		
		String s = 5 + 5 + "5 + 5" + 5 + 5;
		/*
			5 + 5 + "5 + 5" + 5 + 5;
			10 + "5 + 5" + 5 + 5;
			"105 + 5" + 5 + 5;
			"105 + 55" + 5;
			"105 + 555"
		*/
		System.out.println(s);
	}
}
