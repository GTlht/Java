package com.lambda;

public class Demo01 {
	public static void main(String[] args) {
		/*
			补全代码，可以在控制台上打印以下内容：
				约吗
				滚犊子
		*/
		
		/*show(new A() {
			public void show(String s) {
				System.out.println("约吗");
				System.out.println(s);
			}
		});*/
		
		/*show((String s) -> {
			System.out.println("约吗");
			System.out.println(s);
		});*/
		
		show(s -> {
			System.out.println("约吗");
			System.out.println(s);
		});
	}
	
	public static void show(A a) {
		a.show("滚犊子");
	}
 }

interface A {
	public void show(String s);
}
