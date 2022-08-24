package com.lambda;

public class Demo09 {
	public static void main(String[] args) {
		/*I i = new I() {
			public void show(int i) {
				System.out.println(i);
			}
		};
		i.show(12);*/
		
		/*I ii = (int i) -> {System.out.println(i);};
		ii.show(12);*/
		
		/*I ii = i -> System.out.println(i);
		ii.show(12);*/
		
		I ii = System.out::println;
		ii.show(12);
	}
}

interface I {
	public void show(int i);
}
