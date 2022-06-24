package com.array;

public class Demo01 {
	public static void main(String[] args) {
		//1.创建容器
		//元素的数据类型 容器名字 = new 元素的数据类型[元素的个数];	
		int[] arr = new int[5];
		
		//2.向容器中装东西
		//格式：数组名[索引] = 数据;
		arr[0] = 12;
		arr[1] = 11;
		arr[2] = 13;
		arr[3] = 14;
		arr[4] = 15;
		
		//3.从容器中取东西
		//格式：数据类型 变量名 = 数组名字[索引];
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		int d = arr[3];
		int e = arr[4];
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
