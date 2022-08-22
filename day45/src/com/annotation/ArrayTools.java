package com.annotation;

/**
 * 这是一个数组工具类
 * @author 范范
 * @version 1.1
 * @since 1.0
 */
public class ArrayTools {
	private ArrayTools() {}
	
	/**
	 * 遍历数组
	 * @param arr int类型数组
	 */
	public static void print(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	/**
	 * 获取数组中的最大值
	 * @param arr int类型数组
	 * @return 数组中的最大值
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
