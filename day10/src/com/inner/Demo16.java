package com.inner;

public class Demo16 {
	public static void main(String[] args) {
		Tools.getInstance().print();
	}
}

interface Inter {
	public void print();
}

class Tools {
	public static Inter getInstance() {
		return new Inter() {
			public void print() {
				System.out.println("约吗");
			}
		};
	}
}
