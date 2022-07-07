package com.arrays;

import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) {
		//public static int[] copyOf(int[] original,int newLength)
		
		int[] arr = {11,12,13};
		
		arr = Arrays.copyOf(arr, 10);
		
		System.out.println(Arrays.toString(arr));
		
	}
}
