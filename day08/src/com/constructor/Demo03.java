package com.constructor;

public class Demo03 {
	public static void main(String[] args) {
		Dog dog = new Dog();
	}
}

class Dog {
	public Dog() {
		System.out.println("约吗");
		return;
	}
}