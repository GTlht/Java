package com._abstract;

public class Demo03 {
	public static void main(String[] args) {
		
	}
}

abstract class Animal {
	public abstract void eat();
}

class Dog extends Animal {
	public void eat() {
		System.out.println("吃骨头");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("吃鱼");
	}
}
