package com.inner;

public class Demo01 {
	public static void main(String[] args) {
		
	}
}

class Outer {
	private int i = 1;
	
	class Inner {
		int j = 1;
		
		public void print() {
			System.out.println(i);
		}
	}
	
	/*public void print() {
		System.out.println(j);
	}*/
}
