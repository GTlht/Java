package com.variable_parameter;

public class Demo04 {
	public static void main(String[] args) {
		print(1,2,3);
	}
	
	
	public static void print(int i, int...arr) {
		System.out.println(i);
		
		for (int j : arr) {
			System.out.println(j);
		}
	}
	
}
