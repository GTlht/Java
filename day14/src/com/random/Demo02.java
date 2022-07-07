package com.random;

import java.util.Random;

public class Demo02 {
	public static void main(String[] args) {
		//创建对象
		Random r = new Random();
		
		//public int nextInt(int n)
		int num = r.nextInt(5);
		System.out.println(num);//[0,5)
	}
}
