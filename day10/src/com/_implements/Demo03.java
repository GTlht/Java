package com._implements;

public class Demo03 {
	public static void main(String[] args) {
		Zi zi = new Zi();
		zi.eat();
	}
}

interface Fu1 {
	public void eat();
}

interface Fu2 {
	public void eat();
}

class Fu3 {
	
}

class Zi extends Fu3 implements Fu1, Fu2 {
	public void eat() {
		System.out.println("吃");
	}
}

/*class Fu1 {
	public void eat() {
		System.out.println("吃肉");
	}
}

class Fu2 {
	public void eat() {
		System.out.println("吃饭");
	}
}

class Zi extends Fu1, Fu2 {
	
}*/
