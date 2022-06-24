package com.work;

/*
	15.世界最高峰是珠穆朗玛峰(8844.43米=8844430毫米),假如有一张足够大的纸，它的厚度是0.1毫米，
	请问，需要折叠多少次，可以折成珠穆朗玛峰的高度
*/

public class Demo09 {
	public static void main(String[] args) {
		int a = 1;//代表纸的厚度
		int b = 88444300;//代表珠穆朗玛峰的高度
		int count = 0;//次数
		
		while(a < b) {
			a = a * 2;
			count++;
		}
		
		System.out.println(count);
	}
}
