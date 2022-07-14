package com.digui;

//求第N项的斐波那契数列的值是多少？
public class Demo03 {
	public static void main(String[] args) {
		int num = getN(7);
		System.out.println(num);//13
	}
	
	public static int getN(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		
		return getN(n-1) + getN(n-2);
	}
}
