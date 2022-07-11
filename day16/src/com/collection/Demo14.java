package com.collection;

public class Demo14 {
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
	}
}

class Outer {
	class Inner {
		
	}
}
