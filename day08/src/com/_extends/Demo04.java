package com._extends;

public class Demo04 {
	public static void main(String[] args) {
		Zi zi = new Zi();
		zi.print();
		zi.print();
	}
}

class Fu {
	public void print() {
		System.out.println("fu...");
	}
}

class Zi extends Fu {
	@Override
	public void print() {
		System.out.println("zi...");
	}
}

/*class Fu {
	public void printFu() {
		System.out.println("fu...");
	}
}

class Zi extends Fu {
	public void printZi() {
		System.out.println("zi...");
	}
}*/