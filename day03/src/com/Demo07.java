package com;

public class Demo07 {
	public static void main(String[] args) {
		int i = 10;
		//int j = i++ + --i + ++i + i--;
		int a = i++;//a=10,i=11
		int b = --i;//i=10,b=10
		int c = ++i;//i=11,c=11
		int d = i--;//d=11,i=10
		int j = a + b + c + d;//10 + 10 + 11 + 11 = 42
		System.out.println(j);//42
	}
}
