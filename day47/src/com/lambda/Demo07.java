package com.lambda;

public class Demo07 {
	public static void main(String[] args) {
		print(() -> System.out.println("约吗"));
	}
	
	public static void print(G g) {
		g.show();
	}
}

interface G {
	public void show();
}