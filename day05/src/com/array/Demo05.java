package com.array;

public class Demo05 {
	public static void main(String[] args) {
		int[] arr1 = new int[2];
		System.out.println(arr1);//0x001
		System.out.println(arr1[0]);//0
		System.out.println(arr1[1]);//0
		arr1[0] = 1;
		arr1[1] = 2;
		System.out.println(arr1[0]);//1
		System.out.println(arr1[1]);//2
		int[] arr2 = arr1;
		System.out.println(arr2);//0x001
		System.out.println(arr2[0]);//1
		System.out.println(arr2[1]);//2
		System.out.println(arr1[0]);//1
		System.out.println(arr1[1]);//2
	}
}
