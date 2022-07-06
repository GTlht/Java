package com.integer;

public class Demo03 {
	public static void main(String[] args) {
		/*Integer in = 12;
		//Integer in = Integer.valueOf(12);
		System.out.println(in);*/
		
		/*Integer in = new Integer(12);
		int num = in + 2;
		//int num = in.intValue() + 2;
		System.out.println(num);*/
		
		Integer in = new Integer(12);
		in = in + 2;
		/*
			in = Integer.valueOf(in.intValue() + 2);
		*/ 
		System.out.println(in);//14
	}
}
