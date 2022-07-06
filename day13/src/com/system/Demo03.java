package com.system;

public class Demo03 {
	public static void main(String[] args) {
		/*
			public static void arraycopy(Object src,
                             int srcPos,
                             Object dest,
                             int destPos,
                             int length)
		*/
		
		int[] arr1 = {11,12,13,14,15};
		
		int[] arr2 = new int[10];
		
		System.arraycopy(arr1, 0, arr2, 0, 4);
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
