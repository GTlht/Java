package com;

public class Demo12 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		System.out.println(a + "..." + b);
		
		/*//异或位运算方式
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;*/
		
		//第三个临时变量
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println(a + "..." + b);
	}
}
