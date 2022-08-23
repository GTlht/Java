package com.lambda;

public class Demo16 {
	public static void main(String[] args) {
		/*print1(new Inter1() {
			public void show() {
				System.out.println("约吗");
			}
		});*/
		
		/*print2(new Inter2() {
			public void print() {
				System.out.println("约吗");
			}
		});*/
		
		print1(() -> {System.out.println("约吗");});
		print2(() -> {System.out.println("约吗");});
	}
	
	public static void print1(Inter1 inter) {
		inter.show();
	}
	
	public static void print2(Inter2 inter) {
		inter.print();
	}
}

interface Inter1 {
	public void show();
}

interface Inter2 {
	public void print();
}