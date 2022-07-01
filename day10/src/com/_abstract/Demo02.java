package com._abstract;

public class Demo02 {
	public static void main(String[] args) {
		Zi zi = new Zi();
		System.out.println(zi.i);
	}
}

abstract class Fu {
	int i;
	public Fu() {}
}

class Zi extends Fu {
	public Zi() {
		super();
	}
}
