package com._extends;

public class Demo01 {
	public static void main(String[] args) {
		Zi zi = new Zi();
		zi.print();
	}
}

class Fu {
	int i = 1;
}

class Zi extends Fu {
	int i = 2;
	public void print() {
		int i = 3;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}
