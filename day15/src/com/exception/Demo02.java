package com.exception;

public class Demo02 {
	public static void main(String[] args) {
		try {
			int[] arr = null;
			int num = arr[0];
			System.out.println(num);
		} catch(NullPointerException npe) {
			System.out.println("约吗");
		}
		System.out.println("滚犊子");
	}
}
