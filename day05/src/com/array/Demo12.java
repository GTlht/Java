package com.array;

public class Demo12 {
	public static void main(String[] args) {
		//创建容器
		int[] arr = {1,4,2,3,6,5};
		
		//遍历
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//反转
		for(int i = 0, j = arr.length-1; i < arr.length/2; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		//遍历
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
}
