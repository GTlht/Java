package com.digui;

//题一：求N的阶乘，使用递归来实现？
public class Demo02 {
	public static void main(String[] args) {
		int num = getJC(5);
		System.out.println(num);//120
	}
	
	public static int getJC(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n * getJC(n-1);
	}
}
