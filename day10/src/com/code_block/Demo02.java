package com.code_block;

public class Demo02 {
	public static void main(String[] args) {
		Child c1 = new Child();
		Child c2 = new Child("李狗蛋");
		Child c3 = new Child("哪吒", 18);
	}
}

class Child {
	{
		System.out.println("哭");
	}
	
	public Child() {
		//System.out.println("哭");
	}
	
	public Child(String name) {
		//System.out.println("哭");
	}
	
	public Child(String name, int age) {
		//System.out.println("哭");
	}
}