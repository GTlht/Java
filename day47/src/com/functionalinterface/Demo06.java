package com.functionalinterface;

import java.util.function.Predicate;

public class Demo06 {
	public static void main(String[] args) {
		/*Predicate<String> pre = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.equals("约吗");
			}
		};*/
		
		//Predicate<String> pre = (String t) -> {return t.equals("约吗");};
		
		Predicate<String> pre = t -> t.equals("约吗");
		
		System.out.println(pre.test("约吗"));
	}
}

/*
@FunctionalInterface
public interface Predicate<T> { 
	boolean test(T t);
}
*/
