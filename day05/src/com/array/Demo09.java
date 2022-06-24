package com.array;

public class Demo09 {
	public static void main(String[] args) {
		/*//创建数组容器
		int[] arr = {1,5,2,6,4};
		
		//获取最大值
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max);*/
		
		//创建数组容器
		int[] arr = {1,5,2,6,4};
		
		//获取最大值
		int max = 0;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[max] < arr[i]) {
				max = i;
			}
		}
		
		System.out.println(arr[max]);
	}
}
