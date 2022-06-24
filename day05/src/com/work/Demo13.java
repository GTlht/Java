package com.work;

public class Demo13 {
	public static void main(String[] args) {
		boolean c = true;

		if(c = false)
			System.out.println("a");
		else if(c)
			System.out.println("b");
		else if(!c)
			System.out.println("c");
		else
			System.out.println("d");
	}
}
