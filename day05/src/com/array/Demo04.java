package com.array;

public class Demo04 {
	public static void main(String[] args) {
		int[] arr = new int[2];
		System.out.println(arr);//0x001
		System.out.println(arr[0]);//0
		System.out.println(arr[1]);//0
		arr[0] = 12;
		arr[1] = 13;
		System.out.println(arr[0]);//12
		System.out.println(arr[1]);//13
		arr = new int[3];
		System.out.println(arr);//0x002
		System.out.println(arr[0]);//0
		System.out.println(arr[1]);//0
		System.out.println(arr[2]);//0
		arr[1] = 14;
		System.out.println(arr[0]);//0
		System.out.println(arr[1]);//14
		System.out.println(arr[2]);//0
	}
}
