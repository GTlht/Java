package com.exception;

public class Demo03 {
	public static void main(String[] args) {
		try {
			int[] arr = null;
			int num = arr[0];
			System.out.println(num);
		} catch(Exception e) {
			e.printStackTrace();//打印异常信息
		}
		
		System.out.println("滚犊子");
	}
}
