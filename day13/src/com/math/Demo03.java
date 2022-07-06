package com.math;

//实现能够获取1-100之间的随机正整数的方式？
public class Demo03 {
	public static void main(String[] args) {
		/*
			int num = (int)Math.ceil(Math.random() * 100);
			Math.random() -> [0.0, 1.0)
			Math.random() * 100 -> [0.0, 100.0)
			Math.ceil(Math.random() * 100) -> [0.0, 100.0]
			(int)Math.ceil(Math.random() * 100) -> [0, 100]
		*/
		
		/*
			int num =  (int)Math.round(Math.random() * 100);
			Math.random() -> [0.0, 1.0)
			Math.random() * 100 -> [0.0, 100.0)
			Math.round(Math.random() * 100) -> [0.0, 100.0]
			(int)Math.round(Math.random() * 100) -> [0, 100]
		*/
		
		
		/*
			int num = (int)(Math.random() * 100) + 1;
			Math.random() -> [0.0, 1.0)
			Math.random() * 100 -> [0.0, 100.0)
			(int)(Math.random() * 100) -> [0, 99]
			(int)(Math.random() * 100) + 1 -> [1, 100]
		*/
	}
}
