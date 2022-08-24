package com.lambda;

public class Demo02 {
	public static void main(String[] args) {
		//补全代码，实现两个参数的和
		/*print(new B() {
			public int print(int i, int j) {
				return i + j;
			}
		});*/
		
		//print((int i, int j) -> {return i + j;});
		
		print((i, j) -> i + j);
	}
	
	public static void print(B b) {
		int sum = b.print(1, 2);
		System.out.println(sum);
	}
}

interface B {
	public int print(int i, int j);
}
