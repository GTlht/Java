package com.duotai;

public class Demo03 {
	public static void main(String[] args) {
		Fu fu = new Zi();
		fu.print();
	}
}

class Fu {
	public static void print() {
		System.out.println("fu...");
	}
}

class Zi extends Fu {
	public static void print() {
		System.out.println("zi...");
	}
}

/*class Fu {
	static int i = 1;
}

class Zi extends Fu {
	static int i = 2;
}*/
