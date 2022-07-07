package com.arrays;

import java.util.Arrays;

public class Demo01 {
	public static void main(String[] args) {
		//public static void sort(int[] a)
		int[] arr = {1,5,3,4,2};
		
		/*for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();*/
		System.out.println(Arrays.toString(arr));
		
		//排序
		Arrays.sort(arr);
		
		/*for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}*/
		System.out.println(Arrays.toString(arr));
		
	}
}
