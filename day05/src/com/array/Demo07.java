package com.array;

public class Demo07 {
	public static void main(String[] args) {
		int[] arr = {1,2};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		arr = null;
		System.out.println(arr);//null
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
}
