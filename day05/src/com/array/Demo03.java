package com.array;

public class Demo03 {
	public static void main(String[] args) {
		int[] arr1 = new int[]{1,2,3};
		System.out.println(arr1);//0x001
		System.out.println(arr1[0]);//1
		System.out.println(arr1[1]);//2
		System.out.println(arr1[2]);//3
		arr1[1] = 4;
		arr1[2] = 5;
		System.out.println(arr1[0]);//1
		System.out.println(arr1[1]);//4
		System.out.println(arr1[2]);//5
		int[] arr2 = {4,5};
		System.out.println(arr2);//0x002
		System.out.println(arr2[0]);//4
		System.out.println(arr2[1]);//5
		arr2[0] = 6;
		System.out.println(arr2[0]);//6
		System.out.println(arr2[1]);//5
	}
}
