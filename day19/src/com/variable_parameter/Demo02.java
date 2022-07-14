package com.variable_parameter;

public class Demo02 {
	public static void main(String[] args) {
		print();
		print(1);
		print(1,2);
		print(1,2,3);
	}
	
	public static void print(int...a) {
		//System.out.println(a);
		System.out.println(a.length);
	}
}
