package com.variable_parameter;

public class Demo03 {
	public static void main(String[] args) {
		System.out.println(getSum());
		System.out.println(getSum(1));
		System.out.println(getSum(1,2));
		System.out.println(getSum(1,2,3));
	}

	//定义一个方法，该方法的功能是获取N个整数和？
	public static int getSum(int... arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
}
